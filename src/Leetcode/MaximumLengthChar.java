package Leetcode;

public class MaximumLengthChar {
    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(test(str));
    }
    public static int test(String str){
        int count =1;
        int max = 1;
        for(int i =0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }
            else {
                max = Math.max(count,max);
            }
        }
        return max;
    }
}



/*
1446. Consecutive Characters
Easy
1.5K
29
Companies
The power of the string is the maximum length of a non-empty substring that contains only one unique character.

Given a string s, return the power of s.



Example 1:

Input: s = "leetcode"
Output: 2
Explanation: The substring "ee" is of length 2 with the character 'e' only.
Example 2:

Input: s = "abbcccddddeeeeedcba"
Output: 5
Explanation: The substring "eeeee" is of length 5 with the character 'e' only.

 */