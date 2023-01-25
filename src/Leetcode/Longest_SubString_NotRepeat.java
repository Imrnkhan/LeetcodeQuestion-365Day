package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Longest_SubString_NotRepeat {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(test(str));
    }
    public static int test(String str){
        int maxans = Integer.MIN_VALUE;
        for(int i =0;i<str.length();i++){

            Set<Character> hs = new HashSet<>();

            for(int j =i;j<str.length();j++){
                if(hs.contains(str.charAt(j))){
                    maxans = Math.max(maxans,j-1);
                    break;

                }
                hs.add(str.charAt(j));
            }
        }
        return maxans;
    }
}



//
//    int i = 0, j = 0, max = 0;
//    Set<Character> set = new HashSet<>();
//
//    while (j < s.length()) {
//        if (!set.contains(s.charAt(j))) {
//        set.add(s.charAt(j++));
//        max = Math.max(max, set.size());
//        } else {
//        set.remove(s.charAt(i++));
//        }
//        }
//
//        return max;


/*
3. Longest Substring Without Repeating Characters
Medium
31.6K
1.4K
Companies
Given a string s, find the length of the longest
substring
 without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */