package Multithreading_Day14;

class OddThread extends Thread {
    private int limit;

    public OddThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd: " + i);
            }
        }
    }
}

class EvenThread extends Thread {
    private int limit;

    public EvenThread(int limit) {
        this.limit = limit;
    }

    @Override
    public void run() {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            }
        }
    }
}

public class OddEvenMultithreading {
    public static void main(String[] args) {
        int limit = 20; // Define the range limit for odd and even numbers

        // Create threads for odd and even numbers
        OddThread oddThread = new OddThread(limit);
        EvenThread evenThread = new EvenThread(limit);

        // Start both threads
        oddThread.start();
        evenThread.start();
    }
}
