package Leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
  String str = "A man, a plan, a canal: Panama";
        System.out.println(test(str));
    }
    public static boolean test(String str){
        char[] res =   str.toLowerCase().replaceAll("[^a-z^0-9]+", "").toCharArray();
        int left =0;
        int right = res.length-1;
        while (left<right){
            if(res[left]!=res[right])
                return false;
                left++;
                right--;
            }

        return true;
    }
}


/*
125. Valid Palindrome
Easy
5.9K
6.6K
Companies
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */