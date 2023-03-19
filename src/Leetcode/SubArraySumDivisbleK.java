package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumDivisbleK {
    public static void main(String[] args) {
        int[] arr = {4,5,0,-2,-3,1};
        int k = 5;
        System.out.println(test(arr,k));
    }
    public  static int test(int[] nums, int K) {
        Map<Integer, Integer> count = new HashMap<>();
        count.put(0, 1);
        int sum = 0, res = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = (sum + nums[i]) % K;
            if (sum < 0) {
                sum += K;
            }
            res += count.getOrDefault(sum, 0);
            count.put(sum, count.getOrDefault(sum, 0) + 1);
        }

        return res;
    }


}



/*
974. Subarray Sums Divisible by K
Medium
5.7K
230
Companies
Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.



Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
Example 2:

Input: nums = [5], k = 9
Output: 0
 */