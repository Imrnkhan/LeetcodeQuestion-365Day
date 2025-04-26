package Multithreading_Day14;
//
//public class SynchronizationConcept {
//}


class Counters {
    private int count = 0;

    // synchronized Method (only one thread at a time)
     synchronized void increment() { // Now thread-safe
        count++;
    }

    int getCount() {
        return count;
    }
}

public class SynchronizationConcept {
    public static void main(String[] args) throws InterruptedException {
        Counters counter = new Counters();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final Count (with sync): " + counter.getCount()); // Always 2000
    }
}