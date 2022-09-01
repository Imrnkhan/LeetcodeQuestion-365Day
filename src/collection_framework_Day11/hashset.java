package collection_framework_Day11;

import java.util.HashSet;


//HashSet class implements Set Interface.
//  It does not allow the duplicate elements and Insertion order will not be preserved.
//   At most one null value we can add in HashSet object.

public class hashset {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Mumbai");
        hs.add("Chennai");
        hs.add("Pune");
        hs.add("Delhi"); //duplicate element
        hs.add(null); //adding null
        hs.add("Bangaluru");
        System.out.println(hs);


    }
}
