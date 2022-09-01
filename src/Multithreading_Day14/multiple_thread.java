package Multithreading_Day14;

 class threadC extends Thread {
     @Override
     public void run() {
         for (int i = 0; i < 5; i++) {
             System.out.println("inside rum method " + i);
         }
         System.out.println(" thread end  method running....");
     }
 }

     class threadA extends Thread {
         @Override
         public void run() {
             for (int i = 6; i < 10; i++) {
                 System.out.println("inside rum threadA method" + i);
             }
             System.out.println("threadA end method...");

         }
     }

     class threadB extends Thread {
         @Override
         public void run() {
             for (int i = 11; i < 15; i++) {
                 System.out.println("inside run threadB ...");
             }
             System.out.println("threadB end...");
         }

     }


public class multiple_thread{
    public static void main(String[] args) {
        //multiple_thread t1 = new multiple_thread()
        threadA t2 = new threadA();
        threadB t3 = new threadB();
        threadC t1 = new threadC();

        t1.start();
        t2.start();
        t3.start();

        System.out.println("end on  main method...");

    }


}
