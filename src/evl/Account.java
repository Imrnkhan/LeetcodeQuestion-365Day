package evl;

public class Account {
    public static int accountNo;
    public static int balance;

    public  void displayBalance(){
       System.out.println("display balance "+balance);

    }
    public   void   deposit(int amount){
       balance = balance+amount;
       displayBalance();
    }
    public  void withdraw(int amount){
       balance = balance-amount;
       displayBalance();
    }

}
