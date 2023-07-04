package Leetcode;

public class CheckStringperfix {
    public static void main(String[] args) {
        String str = "iloveleetcode";
        String[] word = {"i","love","leetcode","apples"};
        System.out.println(test(str,word));
    }
    public static boolean test(String str,String[]word){
        String ans = "";

        for(int i =0;i<word.length;i++){
            ans+=word[i];
            if(str.length()==ans.length()){
                return str.equals(ans);
            }
        }
        return false;
    }
}

//perfix
//hello -> h he hel hell hello

// and compare string array











/*
1961. Check If String Is a Prefix of Array
Easy
404
75
Companies
Given a string s and an array of strings words, determine whether s is a prefix string of words.

A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some positive k no larger than words.length.

Return true if s is a prefix string of words, or false otherwise.



Example 1:

Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
Output: true
Explanation:
s can be made by concatenating "i", "love", and "leetcode" together.
Example 2:

Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
Output: false
Explanation:
It is impossible to make s using a prefix of arr.
 */