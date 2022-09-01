package Multithreading_Day14;


//sleep method

public class Suspending_thread implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println("inside run method "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }

        }
        System.out.println("ending run method..");
    }

    public static void main(String[] args) {
        Suspending_thread t1 = new Suspending_thread();
        Thread t2 = new Thread(t1);
        t2.start();
        System.out.println("ending the main method...");
    }
}
