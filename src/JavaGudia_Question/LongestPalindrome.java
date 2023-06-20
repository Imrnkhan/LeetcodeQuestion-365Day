package JavaGudia_Question;

import java.util.HashSet;

public class LongestPalindrome {
    public static void main(String[] args) {
        String str = "abccccdd";
        System.out.println(longestPalindrome(str));
    }
    public static int longestPalindrome(String str) {
        HashSet<Character> hs = new HashSet<>();
        int count =0;

        for(int i=0;i<str.length();i++){
            if(hs.contains(str.charAt(i))){
                hs.remove(str.charAt(i));
                count++;
            } else {
                hs.add(str.charAt(i));
            }
        }
        if(!hs.isEmpty()){
            return count*2 +1;
        } else
            return count*2;

    }
}




/*
409. Longest Palindrome
Easy
4.8K
304
Companies
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.



Example 1:

Input: s = "abccccdd"
Output: 7
Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
Example 2:

Input: s = "a"
Output: 1
Explanation: The longest palindrome that can be built is "a", whose length is 1.
 */