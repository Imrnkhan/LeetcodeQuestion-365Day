package Collection_Map_Day12;

import java.util.Map;
import java.util.concurrent.*;

public class ConcurrentHashMapExample {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

        // Adding elements to ConcurrentHashMap
        concurrentHashMap.put("A", "Apple");
        concurrentHashMap.put("B", "Banana");
        concurrentHashMap.put("C", "Cherry");

        // Retrieving an element
        System.out.println("Key A: " + concurrentHashMap.get("A"));

        // Using multiple threads to add elements concurrently
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                concurrentHashMap.put("Key" + i, "Value" + i);
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();


        // Iterating through ConcurrentHashMap
        concurrentHashMap.forEach((k,v)-> System.out.println(k+" "+v));     // another way

        for (Map.Entry<String, String> entry : concurrentHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
/*
ConcurrentHashMap is the best choice when you need thread-safe operations and
 better concurrency handling in multi-threaded pplications. It is preferable to use ConcurrentHashMap
 */