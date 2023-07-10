package JavaImportant50Question;

public class PalindromicSubString {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(CountSubString(str));

    }
    public static int CountSubString(String str){
        int count = 0;
        for(int i =0;i<str.length();i++){
            for(int j =i;j<str.length();j++){
                if (isPalindrome(str, i, j)) {
                    count++;
                }
            }
        }
        return count;
    }
    private static boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}


// O(n^3

/*
647. Palindromic Substrings
Medium
9.2K
195
Companies
Given a string s, return the number of palindromic substrings in it.

A string is a palindrome when it reads the same backward as forward.

A substring is a contiguous sequence of characters within the string.



Example 1:

Input: s = "abc"
Output: 3
Explanation: Three palindromic strings: "a", "b", "c".
Example 2:

Input: s = "aaa"
Output: 6
Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 */