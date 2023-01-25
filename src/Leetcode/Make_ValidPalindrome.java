package Leetcode;

public class Make_ValidPalindrome {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(palindrome(str));

    }
    private static boolean checkPalindrome(int left, int right, String str){
        while (left<right){
            if(str.charAt(left++)!=str.charAt(right--)){
            return false;
            }
        }
        return true;
    }

    public static boolean palindrome(String str){
        int left =0;
        int right = str.length()-1;
        while (left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return checkPalindrome(left + 1, right, str) || checkPalindrome(left, right - 1, str);
            }
              left++;
              right--;
        }
        return true;
    }
}







/*
680. Valid Palindrome II
Easy
6.8K
346
Companies
Given a string s, return true if the s can be palindrome after deleting at most one character from it.



Example 1:

Input: s = "aba"
Output: true
Example 2:

Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:

Input: s = "abc"
Output: false
 */