package Multithreading_Day14;

public class join_method implements Runnable{
    int sum;
    @Override
    public void run() {
        for(int i =0;i<5;i++){
            System.out.println("inside run method..");
            sum+=i;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        join_method t1 = new join_method();
        Thread t2 = new Thread(t1);
        t2.start();
        t2.join();

        int result = t1.sum;
        for(int i =0;i<10;i++){
            System.out.println("inside main method..");
            System.out.println(result);
        }
    }

}
