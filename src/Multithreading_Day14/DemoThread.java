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
        private Counters counter;

        public DemoThread(Counters counter) {
            this.counter = counter;
        }

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                counter.increment();
            }
        }

        public static void main(String[] args) {
            Counters counter = new Counters();
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

//
//class Counter {
//    private int count = 0;
//
//    public synchronized void increment() {
//        count++;
//    }
//
//    public synchronized int getCount() {
//        return count;
//    }
//}
//
//class CounterThread extends Thread {
//    private Counter counter;
//
//    CounterThread(Counter counter) {
//        this.counter = counter;
//    }
//
//    public void run() {
//        for (int i = 0; i < 5; i++) {
//            counter.increment();
//            System.out.println(Thread.currentThread().getName() + " - Count: " + counter.getCount());
//        }
//    }
//
//    public static void main(String[] args) {
//        Counter counter = new Counter();
//        Thread t1 = new CounterThread(counter);
//        Thread t2 = new CounterThread(counter);
//
//        t1.start();
//        t2.start();
//    }
//}

/*
Let's do a **dry run** of your Java multithreading program step-by-step. Your code uses **synchronized methods** to ensure **thread safety** when updating the shared counter.

---

### **Overview of Execution**
1. The program creates a **shared counter** (`Counter` object).
2. Two **threads** (`t1` and `t2`) modify this shared counter.
3. Each thread **increments** the counter **5 times** and prints its value.
4. The `synchronized` keyword ensures **no race conditions** when updating the counter.

---

### **Dry Run with Execution Steps**
Let's analyze how the program runs assuming:
- `t1` starts first, followed by `t2`.
- The counter initially starts at `0`.

#### **Step-by-Step Execution**
| Step | Thread | Counter Value Before | Action | Counter Value After |
|------|--------|--------------------|---------|-------------------|
| 1    | `t1`   | `0`                 | `increment()` | `1` |
| 2    | `t1`   | `1`                 | `increment()` | `2` |
| 3    | `t1`   | `2`                 | `increment()` | `3` |
| 4    | `t1`   | `3`                 | `increment()` | `4` |
| 5    | `t1`   | `4`                 | `increment()` | `5` |
| 6    | `t2`   | `5`                 | `increment()` | `6` |
| 7    | `t2`   | `6`                 | `increment()` | `7` |
| 8    | `t2`   | `7`                 | `increment()` | `8` |
| 9    | `t2`   | `8`                 | `increment()` | `9` |
| 10   | `t2`   | `9`                 | `increment()` | `10` |

Each thread increments **sequentially** because the `synchronized` methods prevent **concurrent modifications**.

---

### **Expected Output (May vary due to thread scheduling)**:
```
Thread-0 - Count: 1
Thread-0 - Count: 2
Thread-0 - Count: 3
Thread-0 - Count: 4
Thread-0 - Count: 5
Thread-1 - Count: 6
Thread-1 - Count: 7
Thread-1 - Count: 8
Thread-1 - Count: 9
Thread-1 - Count: 10
```

**Thread scheduling may vary**, so the exact sequence might differ, but the final count should always reach **10**.

---

### **Why `synchronized` Matters?**
Without `synchronized`, both threads **could modify `count` at the same time**, leading to:
- **Race conditions** where multiple threads update the value incorrectly.
- **Inconsistent results**, like skipping numbers.

But here, **each thread waits** until the other finishes **before modifying the counter**, ensuring safe multi-threaded execution.

---

### **Key Takeaways**
✅ **Thread safety** is achieved using `synchronized`.
✅ **Order of execution depends on the JVM scheduler** but the final counter value is always correct.
✅ **Uses shared memory**, ensuring consistency across threads.

Would you like enhancements, such as using `AtomicInteger` or removing synchronization? 🚀

 */