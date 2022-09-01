package collection_framework_Day11;

import java.util.LinkedHashSet;

public class linked_hash_set {
    public static void main(String[] args) {
        LinkedHashSet<String>lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Chennai");
        lhs.add("Pune");
        lhs.add("Delhi"); //duplicate element
        lhs.add(null); //adding null
        lhs.add(null);
        lhs.add("Bangaluru");
        System.out.println(lhs);

    }
}
