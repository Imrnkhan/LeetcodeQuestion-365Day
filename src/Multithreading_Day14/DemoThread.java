package Multithreading_Day14;


    class Counter {
        private int count = 0; // shared resource

        // Synchronized method to make increment() thread-safe
        public synchronized void increment() {  // ager aap synchronized keyword use nhi krte ho to random ans hoga
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public class DemoThread extends Thread {
        private Counter counter;

        public DemoThread(Counter counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        }

        public static void main(String[] args) {
            Counter counter = new Counter();
            DemoThread t1 = new DemoThread(counter);
            DemoThread t2 = new DemoThread(counter);
            t1.start();
            t2.start();
            try {
                t1.join();
                t2.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(counter.getCount()); // Expected: 2000
        }
    }

/*
The output of the code is not 2000 because the increment method in the Counter
 class is not synchronized. This results in a race condition when both threads try
  to increment the count variable concurrently.

Without synchronization, one thread might read the value of count before the other thread
has finished writing its incremented value. This can lead to both threads reading the same value,
incrementing it, and writing it back, effectively losing one of the increments.
 */