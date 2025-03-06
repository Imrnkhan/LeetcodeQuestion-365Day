package Collection_Map_Day12;

import java.util.LinkedHashMap;
import java.util.Map;

public class Linked_Hash_Map {
    public static void main(String args[]) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put(100, "Amit");
        hm.put(101, "Vijay");
        hm.put(102, "Rahul");
        System.out.println(hm);
        hm.forEach((k,v)-> System.out.println(k+" "+v));

//        for (Map.Entry<Integer, String> me : hm.entrySet()) {        // same but another way
//            System.out.println(me.getKey() + " " + me.getValue());

//        }
    }
}

// linked data structure natural order follow krta hi
