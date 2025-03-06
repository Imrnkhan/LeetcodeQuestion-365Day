package Coding_Question;
import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyCharacter {
    public static void main(String[] args) {
        String s = "testsample";  // You can change this to test other cases
        char result = maxOccurringCharacter(s);
        System.out.println("The maximum occurring character is: " + result);
    }

    public static char maxOccurringCharacter(String s) {
        // Create a map to store the frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Print the frequency map
        freqMap.forEach((k, v) -> System.out.println(k + " " + v));

        // Find the character with the maximum frequency
        char maxChar = ' ';
        int maxFreq = 0;

        // Iterate through the map to find the max frequency and corresponding character
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxFreq || (entry.getValue() == maxFreq && entry.getKey() < maxChar)) {
                maxFreq = entry.getValue();
                maxChar = entry.getKey();
            }
        }

        return maxChar;
    }
}
