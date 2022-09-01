package evl;

public class Main {
    public static void main(String[] args)  {

        Account ABC = new Account();
        ABC.balance = 1000;
        ABC.accountNo = 111;

        deposit D = new deposit(500, ABC);
        withdraw W = new withdraw(580, ABC);


        Thread thread1 = new Thread(D);
        Thread thread2 = new Thread(W);
        thread1.start();
        thread2.start();
    }


}
