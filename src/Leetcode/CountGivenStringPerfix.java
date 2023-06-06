package Leetcode;

public class CountGivenStringPerfix {
    public static void main(String[] args) {
        String[] words = {"a", "b", "c", "ab", "bc", "abc"};
        String str = "abc";
        System.out.println(test(words,str));

    }
    public static int test(String[] word,String str){
        int count = 0;
    for (String words: word){
        if(str.endsWith(words)){
            count++;
        }
    }
        return count;
    }
}








/*
2255. Count Prefixes of a Given String
Easy
433
15
Companies
You are given a string array words and a string s, where words[i] and s comprise only of lowercase English letters.

Return the number of strings in words that are a prefix of s.

A prefix of a string is a substring that occurs at the beginning of the string. A substring is a contiguous sequence of characters within a string.



Example 1:

Input: words = ["a","b","c","ab","bc","abc"], s = "abc"
Output: 3
Explanation:
The strings in words which are a prefix of s = "abc" are:
"a", "ab", and "abc".
Thus the number of strings in words which are a prefix of s is 3.
Example 2:

Input: words = ["a","a"], s = "aa"
Output: 2
Explanation:
Both of the strings are a prefix of s.
Note that the same string can occur multiple times in words, and it should be counted each time.
 */