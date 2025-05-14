package ArrayList_Problem;

import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Blue");

        ListIterator<String> lit = list.listIterator();

        // Forward direction
        System.out.println("Forward:");
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        // Backward direction
        System.out.println("Backward:");
        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
    }
}

/*
ListIterator is used with List types only (ArrayList, LinkedList, etc.)
It can move forward and backward.
You can add, remove, and update elements while iterating.
 */