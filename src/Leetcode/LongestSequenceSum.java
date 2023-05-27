package Leetcode;

import java.util.Arrays;

public class LongestSequenceSum {
    public static void main(String[] args) {
        int[] arr = {4,5,2,1};
        int[] ans = {3,10,21};
        System.out.println(Arrays.toString(test(arr, ans)));
    }
    public static int[] test(int[]arr,int[]ans){
        int[] res = new int[ans.length];
        Arrays.sort(arr);
        for(int i =0;i<res.length;i++){
            res[i] = getsum(arr,ans[i]);

        }
        return res;
    }
    private static int getsum(int[]arr,int ans){    //need 2nd argument as ans
        int res = 0;
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(res+arr[i]<=ans){
                res+=arr[i];
                count++;
            }
        }

        return count;
    }
}



// esa mai arr 1st of sum krna hi or less than or print the arr size


/*
2389. Longest Subsequence With Limited Sum
Easy
1.6K
140
Companies
You are given an integer array nums of length n, and an integer array queries of length m.

Return an array answer of length m where answer[i] is the maximum size of a subsequence that you can take from nums such that the sum of its elements is less than or equal to queries[i].

A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.



Example 1:

Input: nums = [4,5,2,1], queries = [3,10,21]
Output: [2,3,4]
Explanation: We answer the queries as follows:
- The subsequence [2,1] has a sum less than or equal to 3. It can be proven that 2 is the maximum size of such a subsequence, so answer[0] = 2.
- The subsequence [4,5,1] has a sum less than or equal to 10. It can be proven that 3 is the maximum size of such a subsequence, so answer[1] = 3.
- The subsequence [4,5,2,1] has a sum less than or equal to 21. It can be proven that 4 is the maximum size of such a subsequence, so answer[2] = 4.
Example 2:

Input: nums = [2,3,4,5], queries = [1]
Output: [0]
Explanation: The empty subsequence is the only subsequence that has a sum less than or equal to 1, so answer[0] = 0.

 */