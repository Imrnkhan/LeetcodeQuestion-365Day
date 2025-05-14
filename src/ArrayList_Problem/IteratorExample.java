package ArrayList_Problem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> hs = new ArrayList<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);


        Iterator<Integer> ans = hs.iterator();
        while (ans.hasNext()){
            int demo = ans.next();

            System.out.println(demo);
        }
    }
}


/*
Iterator is used to traverse (loop through) a collection like ArrayList, HashSet, etc.
It only goes forward, not backward.
You can read and remove elements, but not add or update.
 */