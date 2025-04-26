package Multithreading_Day14;

class Resource {
    void methodA(Resource resource) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked methodA.");
            synchronized (resource) {
                System.out.println(Thread.currentThread().getName() + " trying to lock methodB.");
            }
        }
    }

    void methodB(Resource resource) {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " locked methodB.");
            synchronized (resource) {
                System.out.println(Thread.currentThread().getName() + " trying to lock methodA.");
            }
        }
    }
}


public class DeadlockExample {
    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        Thread t1 = new Thread(() -> resource1.methodA(resource2));
        Thread t2 = new Thread(() -> resource2.methodB(resource1));

        t1.start();
        t2.start();
    }
}
// dedlock exp incorrect code because dedlock    occurs wait each other infinite time





//class Resource {
//    void methodA(Resource resource) {
//        synchronized (this) { // Lock first resource
//            System.out.println(Thread.currentThread().getName() + " locked methodA.");
//            try { Thread.sleep(100); } catch (InterruptedException e) {}
//
//            synchronized (resource) { // Waits for second resource
//                System.out.println(Thread.currentThread().getName() + " trying to lock methodB.");
//            }
//        }
//    }
//
//    void methodB(Resource resource) {
//        synchronized (this) { // Lock first resource
//            System.out.println(Thread.currentThread().getName() + " locked methodB.");
//            try { Thread.sleep(100); } catch (InterruptedException e) {}
//
//            synchronized (resource) { // Waits for second resource
//                System.out.println(Thread.currentThread().getName() + " trying to lock methodA.");
//            }
//        }
//    }
//}
//
//public class DeadlockExample {
//    public static void main(String[] args) {
//        Resource resource1 = new Resource();
//        Resource resource2 = new Resource();
//
//        Thread t1 = new Thread(() -> resource1.methodA(resource2));
//        Thread t2 = new Thread(() -> resource2.methodB(resource1));
//
//        t1.start();
//        t2.start();
//    }
//}