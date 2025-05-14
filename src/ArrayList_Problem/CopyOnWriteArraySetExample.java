package ArrayList_Problem;

import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySetExample {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Java"); // Duplicate, won't be added

        System.out.println("Set: " + set);

        // Safe iteration
        for (String language : set) {
            System.out.println("Reading: " + language);
            set.remove("C++"); // Safe: won't throw exception
        }

        System.out.println("Final Set: " + set);
    }
}

/*
It’s a Set based on CopyOnWriteArrayList.
It is thread-safe — safe to use in multi-threaded environments without external synchronization.
It avoids ConcurrentModificationException during iteration.

ConcurrentSkipListSet - same thread safe and same code but name change
 */