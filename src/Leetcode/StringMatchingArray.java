package Leetcode;

import java.util.ArrayList;

public class StringMatchingArray {
    public static void main(String[] args) {
        String[] str = {"mass","as","hero","superhero"};
        System.out.println(test(str));

    }
    public static ArrayList<String> test(String[] str){
        ArrayList<String> hs= new ArrayList<>();
        for(int i =0;i<str.length;i++){
            for(int j =0;j<str.length;j++){
                if(str[i]==str[j])
                    continue;
                if(str[j].contains(str[i])){
                    hs.add(str[i]);
                    break;
                }
            }
        }
        return hs;
    }
}



/*
1408. String Matching in an Array
Easy
725
81
Companies
Given an array of string words, return all strings in words that is a substring of another word. You can return the answer in any order.

A substring is a contiguous sequence of characters within a string



Example 1:

Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.
Example 2:

Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".
Example 3:

Input: words = ["blue","green","bu"]
Output: []
Explanation: No string of words is substring of another string.

 */