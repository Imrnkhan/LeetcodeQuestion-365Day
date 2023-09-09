package Coding_Question;

import java.util.HashSet;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String str = "Leetcode";
        System.out.println(test(str));
    }
   public static String test(String str) {
        HashSet<Character> hs = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (hs.add(str.charAt(i))) {
                // If the character is not in the set (i.e., it's unique), add it to the result.
                result.append(str.charAt(i));
            }
        }

        // Convert the StringBuilder to a String and return it.
        return result.toString();
    }
}
