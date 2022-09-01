package Multithreading_Day14;
//Getting and setting name of a thread with rennable method
//public final String getName(); //1
//public final void setName(String name); //2


public class Getting_setting_name_thread implements Runnable {

    @Override
    public void run() {
        for(int i =0;i<5;i++){
            System.out.println("runing run method inside...");
        }
        System.out.println("end run method...");
    }

    public static void main(String[] args) {
        Getting_setting_name_thread t1 = new Getting_setting_name_thread();
        Thread t2 = new Thread(t1);
        t2.start();
        t2.setName("Imran khan");

        System.out.println("running main method"+" "+t2.getName());

    }
}
