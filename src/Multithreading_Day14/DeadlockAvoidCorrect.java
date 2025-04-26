package Multithreading_Day14;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class SafeResource {
    private final Lock lock1 = new ReentrantLock();
    private final Lock lock2 = new ReentrantLock();

    void safeMethodA(SafeResource resource) {
        if (lock1.tryLock()) {
            try {
                System.out.println(Thread.currentThread().getName() + " locked safeMethodA.");
                Thread.sleep(100);

                if (resource.lock2.tryLock()) { // Try locking second resource
                    try {
                        System.out.println(Thread.currentThread().getName() + " locked safeMethodB.");
                    } finally {
                        resource.lock2.unlock(); // Unlock second resource
                    }
                }
            } catch (InterruptedException ignored) {
            } finally {
                lock1.unlock(); // Unlock first resource
            }
        }
    }
}

public class DeadlockAvoidCorrect {
    public static void main(String[] args) {
        SafeResource resource1 = new SafeResource();
        SafeResource resource2 = new SafeResource();

        Thread t1 = new Thread(() -> resource1.safeMethodA(resource2));
        Thread t2 = new Thread(() -> resource2.safeMethodA(resource1));

        t1.start();
        t2.start();
    }
}
// this code dedlock avoided dont wait forever use tryLock Reentrantlock