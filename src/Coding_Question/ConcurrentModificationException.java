package Coding_Question;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcurrentModificationException {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for (String item : list) {
            list.remove(1); // This will cause ConcurrentModificationException
        }
}
}

// This way to remove ConcurrentModificationException
/*
 Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("B".equals(item)) {
                iterator.remove(); // Safely removing element using iterator
            }
        }
        System.out.println("List after removal: " + list);
 */