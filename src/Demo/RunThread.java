package Demo;

public class RunThread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            String tname=Thread.currentThread().getName();
            System.out.println(tname +": is running");
        }
    }
    public static void main(String[] args){
        RunThread job=new RunThread();
        Thread one=new Thread(job);
        Thread two=new Thread(job);
        one.setName("Dhoni thread..");
        two.setName("Kohli thread..");
        one.start();
        two.start();

    }
}
