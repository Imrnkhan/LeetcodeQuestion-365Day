package Coding_Question;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountCharacter {
    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        test(str);
    }

    public static void test(String str) {

        LinkedHashMap<Character, Integer> hs = new LinkedHashMap<>();
        // use given order input if you use HashMap not given order
        for (int i = 0; i < str.length(); i++) {
            hs.put(str.charAt(i), hs.getOrDefault(str.charAt(i), 0) + 1);
        }
        System.out.println(hs);
        hs.forEach((key, value) -> System.out.println(key + " " + value));

    }
}


/*
str.charAt(i) retrieves the character at position i.
hs.getOrDefault(str.charAt(i), 0) retrieves the current count of the character from the LinkedHashMap.
If the character is not present, it returns 0.
hs.put(str.charAt(i), hs.getOrDefault(str.charAt(i), 0) + 1) adds the character to the map with
its count incremented by 1. If the character is already present, its count is incremented; otherwise,
 a new entry with count 1 is added.
 */