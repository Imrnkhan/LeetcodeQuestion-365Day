package Leetcode;

import java.util.Arrays;

public class Valid_Anagram_String {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(test(str1,str2));
    }
    public static boolean test(String str1, String str2){
        // Converting String to Charater Array
        // The java string toCharArray() method converts this string into character array

        char[] t = str1.toCharArray();
        char[] s = str2.toCharArray();

        //sort
        Arrays.sort(t);
        Arrays.sort(s);

        return Arrays.equals(t,s);
        }
    }



/*
242. Valid Anagram
Easy
8.1K
261
Companies
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
 */