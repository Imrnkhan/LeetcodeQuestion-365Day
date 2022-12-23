package Collection_Map_Day12;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_Hash_Map {
    public static void main(String args[]) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");

        for (Map.Entry<Integer, String> me : hm.entrySet()) {
            System.out.println(me.getKey() + " " + me.getValue());

        }
    }
}