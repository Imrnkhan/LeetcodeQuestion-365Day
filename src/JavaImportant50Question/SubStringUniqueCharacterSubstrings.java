package JavaImportant50Question;

import java.util.HashSet;

public class SubStringUniqueCharacterSubstrings {

    public static int minSubstringsWithUniqueChars(String str) {
        HashSet<Character> seen = new HashSet<>();
        int substringCount = 1; // Start with 1 substring

        for (char ch : str.toCharArray()) {
            if (seen.contains(ch)) {
                // If character is already seen, start a new substring
                substringCount++;
                seen.clear(); // Clear the set for the new substring
            }
            seen.add(ch); // Add the character to the set
        }

        return substringCount;
    }

    public static void main(String[] args) {
        String str = "abacaba";
        System.out.println(minSubstringsWithUniqueChars(str)); // Output: 4
    }
}
