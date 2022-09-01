package Multithreading_Day14;

public class extending_thread extends Thread {
    public void run(){
        System.out.println("thread running...");
    }

    public static void main(String[] args) {
        extending_thread Demo = new extending_thread();
        Demo.start();
        System.out.println("main method..");
    }
}
