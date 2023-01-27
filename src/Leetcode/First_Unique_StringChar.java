package Leetcode;

public class First_Unique_StringChar {
    public static void main(String[] args) {
        String str = "loveleetcode";
        System.out.println(test(str));
    }
    public static int test(String str){
        char[] ans = str.toCharArray();
        for(int i =0;i<str.length();i++){
            if(str.indexOf(ans[i])==str.lastIndexOf(ans[i]))
                return i;
        }
        return -1;
    }
}


// String to CharArray and start 1st index to end index


/*
387. First Unique Character in a String
Easy
7.3K
249
Companies
Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.



Example 1:

Input: s = "leetcode"
Output: 0
Example 2:

Input: s = "loveleetcode"
Output: 2
Example 3:

Input: s = "aabb"
Output: -1

 */