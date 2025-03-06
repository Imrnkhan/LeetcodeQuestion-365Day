package Multithreading_Day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collection_Non_ThreadSafe_MakeThread_Safe {
    public static void main(String[] args) {
        // Non-thread-safe collection
        List<String> list = new ArrayList<>();

        // Make it thread-safe
        List<String> synchronizedList = Collections.synchronizedList(list);

        // Add elements in a thread-safe manner
        synchronizedList.add("Element1");
        synchronizedList.add("Element2");

        // Iterate with explicit synchronization
        synchronized (synchronizedList) {
            for (String item : synchronizedList) {
                System.out.println(item);
            }
        }

    }
}

/*
Methods:
Collections.synchronizedList(List<T> list)

Collections.synchronizedSet(Set<T> set)

Collections.synchronizedMap(Map<K, V> map)

Collections.synchronizedCollection(Collection<T> c)


You can manually synchronize access to non-thread-safe collections using the synchronized keyword


public class ManualSynchronizationExample {
    private final List<String> list = new ArrayList<>();

    public void add(String item) {
        synchronized (list) {
            list.add(item);
        }
    }

    public void printAll() {
        synchronized (list) {
            for (String item : list) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        ManualSynchronizationExample example = new ManualSynchronizationExample();
        example.add("Element1");
        example.add("Element2");
        example.printAll();
    }
}
 */