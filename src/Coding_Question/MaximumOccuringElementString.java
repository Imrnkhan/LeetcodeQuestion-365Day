package Coding_Question;

import java.util.HashMap;
import java.util.TreeMap;

public class MaximumOccuringElementString {
    public static void main(String[] args) {

        String str = "abcdcsvscd";

        HashMap<Character, Integer> charFreq = new HashMap<>();

// iterate through the string and count the frequency
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

// find the character with the highest frequency
        char maxChar = ' ';
        int maxFreq = 0;
        for (char c : charFreq.keySet()) {
            int freq = charFreq.get(c);
            if (freq > maxFreq) {
                maxChar = c;
                maxFreq = freq;
            }
        }

        System.out.println("The maximum occurring character is " + maxChar + " with a frequency of " + maxFreq);

    }
}
