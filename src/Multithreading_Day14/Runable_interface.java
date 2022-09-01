package Multithreading_Day14;

public class Runable_interface implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread has ended");
    }

    public static void main(String[] args) {
        Runable_interface demo = new Runable_interface();
        Thread t1 = new Thread(demo);//Using the constructor Thread(Runnable)
        t1.start();
//        t1.run();
        System.out.println("main method");
    }
}
