package Leetcode;

import java.util.Arrays;

public class Array_RotateKElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println(Arrays.toString(test(arr, k)));
    }
    public static int[] test(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j >0; j--)
                arr[j] = arr[j - 1];
                arr[0] = temp;


        }

        return arr;
    }
}


/*
189. Rotate Array
Medium
12.9K
1.5K
Companies
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.



Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */