package Leetcode;

import java.util.HashSet;

public class LongestPalindrone {
    public static void main(String[] args) {
        String str = "abccccdd";
        System.out.println(test(str));
    }
    public static int test(String str){
        HashSet<Character> hs = new HashSet<>();
        int count =0;
        for(int i =0;i<str.length();i++){
            char res = str.charAt(i);
            if(hs.contains(res)){
                hs.remove(res);
                count++;
            }
            else {
                hs.add(res);
            }
        }
        if(!hs.isEmpty()){
            return count*2 +1;
        }
        else

        return count*2;

    }
}


/*
409. Longest Palindrome
Easy
4.3K
259
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