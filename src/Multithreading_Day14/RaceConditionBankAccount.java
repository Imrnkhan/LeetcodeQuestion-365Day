package Multithreading_Day14;

public class RaceConditionBankAccount {
    private int balance;

    public RaceConditionBankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(int amount) {
        int currentBalance = balance;
        balance = currentBalance + amount;
    }

    public void withdraw(int amount) {
        int currentBalance = balance;
        balance = currentBalance - amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) throws InterruptedException {
        RaceConditionBankAccount account = new RaceConditionBankAccount(100);

        Runnable depositTask = () -> {
            for (int i = 0; i < 1000; i++) {
                account.deposit(50);
            }
        };

        Runnable withdrawTask = () -> {
            for (int i = 0; i < 1000; i++) {
                account.withdraw(30);
            }
        };

        Thread threadA = new Thread(depositTask);
        Thread threadB = new Thread(withdrawTask);

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("Final balance: " + account.getBalance());
    }
}

/*
its process but due to Race conditon out will show diff also
        Each depositTask call adds 50 units 1000 times: 50 * 1000 = 50000.
        Each withdrawTask call subtracts 30 units 1000 times: 30 * 1000 = 30000.
        Starting balance: 100.
        Final expected balance: 100 + 50000 - 30000 = 20100.  its final and corrected



 */




//to resolve this problem use synchronized keyword

/*
package Zap;

public class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        int currentBalance = balance;
        balance = currentBalance + amount;
    }

    public synchronized void withdraw(int amount) {
        int currentBalance = balance;
        balance = currentBalance - amount;
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccount(100);

        Runnable depositTask = () -> {
            for (int i = 0; i < 1000; i++) {
                account.deposit(50);
            }
        };

        Runnable withdrawTask = () -> {
            for (int i = 0; i < 1000; i++) {
                account.withdraw(30);
            }
        };

        Thread threadA = new Thread(depositTask);
        Thread threadB = new Thread(withdrawTask);

        threadA.start();
        threadB.start();

        threadA.join();
        threadB.join();

        System.out.println("Final balance: " + account.getBalance());
    }
}

 */