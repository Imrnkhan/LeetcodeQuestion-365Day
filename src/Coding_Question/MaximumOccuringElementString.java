package Coding_Question;

import java.util.TreeMap;

public class MaximumOccuringElementString {
    public static void main(String[] args) {

        String str = "abcdcsvscd";

// create a TreeMap to store the frequency of each character
        TreeMap<Character, Integer> charFreq = new TreeMap<>();

// iterate through the string and count the frequency
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (charFreq.containsKey(c)) {
                charFreq.put(c, charFreq.get(c) + 1);
            } else {
                charFreq.put(c, 1);
            }
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
