package Collection_Map_Day12;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> hs = new HashMap<>();
        hs.put(1,"one");
        hs.put(2,"two");
        hs.put(2,"null");
        hs.put(3,"three");
        hs.put(3,"four");
        hs.put(null,"six");
        System.out.println(hs);

    }
}
