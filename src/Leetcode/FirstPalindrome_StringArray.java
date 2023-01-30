package Leetcode;

public class FirstPalindrome_StringArray {
    public static void main(String[] args) {
        String[] word = {"abc","car","ada","racecar","cool"};
        System.out.println(test(word));
    }
    private static boolean isPalindrome(String str){
        int left =0;
        int right = str.length()-1;
        while (left<right){
            if(str.charAt(left++)!=str.charAt(right--)){
                return false;
            }
        }
        return true;
    }
    public static String test(String[]word){
        for(int i=0;i< word.length;i++){
            if(isPalindrome(word[i])){
                return word[i];
            }
        }
        return "";
    }
}



/*
2108. Find First Palindromic String in the Array
Easy
710
26
Companies
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.



Example 1:

Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
Explanation: The first string that is palindromic is "ada".
Note that "racecar" is also palindromic, but it is not the first.
Example 2:

Input: words = ["notapalindrome","racecar"]
Output: "racecar"
Explanation: The first and only string that is palindromic is "racecar".
Example 3:

Input: words = ["def","ghi"]
Output: ""
Explanation: There are no palindromic strings, so the empty string is returned.
 */