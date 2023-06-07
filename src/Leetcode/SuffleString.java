package Leetcode;

public class SuffleString {
    public static void main(String[] args) {
        String str = "codeleet";
        int[] arr = {4,5,6,7,0,2,1,3};
        System.out.println(test(str,arr));
    }
    public static String test(String str, int[] arr){
        char[]ans = new char[str.length()];
        for(int i =0;i<arr.length;i++){
            ans[arr[i]]= str.charAt(i);
        }
        return new String(ans) ;
    }
}






/*
1528. Shuffle String
Easy
2.3K
411
Companies
You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

Return the shuffled string.



Example 1:


Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
Example 2:

Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
 */