package Coding_Question;

import java.util.HashMap;

public class FristNonRepeatingChar {
    public static void main(String[] args) {
        String s = "geeksforgeeks";

        System.out.println(firstNonRepeating(s));

    }

        public static char firstNonRepeating(String s) {
            // Step 1: Create a HashMap to store the frequency of each character
            HashMap<Character, Integer> freqMap = new HashMap<>();

            // Step 2: Count the frequency of each character
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
            }

            // Step 3: Find the first non-repeating character
            for (int i = 0; i < s.length(); i++) {
                if (freqMap.get(s.charAt(i)) == 1) {
                    return s.charAt(i);
                }
            }

            // Step 4: If no non-repeating character is found, return '$'
            return '$';
        }
    }


