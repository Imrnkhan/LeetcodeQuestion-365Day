package GeekForGeek;

import java.util.HashSet;

public class NotRepeatChar {
    public static void main(String[] args) {
        String str = "zxvczbtxyzvy";
        System.out.println(findFirstNonRepeatingCharacter(str));
    }
    public static char findFirstNonRepeatingCharacter(String S) {
        HashSet<Character> seen = new HashSet<>();
        HashSet<Character> nonRepeatingChars = new HashSet<>();

//        for (char ch : S.toCharArray()) {                //use another way
        for(int i =0;i<S.length();i++){
            if (!seen.contains(S.charAt(i))) {
                seen.add(S.charAt(i));
                nonRepeatingChars.add(S.charAt(i));
            } else {
                nonRepeatingChars.remove(S.charAt(i));
            }
        }

//        for (char ch : S.toCharArray()) {              //use another way

        for(int i =0;i<S.length();i++){
            if (nonRepeatingChars.contains(S.charAt(i))) {
                return S.charAt(i);
            }
        }

        return '$'; // If no non-repeating character is found
    }
}



/*
Given a string S consisting of lowercase Latin Letters. Return the first non-repeating character in S. If there is no non-repeating character, return '$'.

Example 1:

Input:
S = hello
Output: h
Explanation: In the given string, the
first character which is non-repeating
is h, as it appears first and there is
no other 'h' in the string.
 */