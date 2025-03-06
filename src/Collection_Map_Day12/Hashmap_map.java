package Collection_Map_Day12;

import java.util.HashMap;

public class Hashmap_map {
    public static void main(String[] args) {
        HashMap<Integer,String> hs = new HashMap<>();
        hs.put(1,"one");
        hs.put(2,"two");
        hs.put(2,"null");
        hs.put(3,"three");
        hs.put(3,"four");
        hs.put(null,"six");
        System.out.println(hs);
        System.out.println(hs.get(4));
        hs.forEach((k,v)-> System.out.println(k+" "+v));

    }
}
//Null Keys/Values: Allows one null key and any number of null values.