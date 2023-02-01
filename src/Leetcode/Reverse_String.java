package Leetcode;

import java.util.Arrays;

public class Reverse_String {
    public static void main(String[] args) {
        String[] str = {"h","e","l","l","o"};
        System.out.println(Arrays.toString(Reverse(str)));
    }
    public static String[] Reverse(String[] str){
        int left = 0;
        int right =str.length-1;
        while (left<right){
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;


        }
        return str;
    }
}




/*
344. Reverse String
Easy
6.8K
1K
Companies
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.



Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */