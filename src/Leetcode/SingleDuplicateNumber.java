package Leetcode;

import java.util.Arrays;

public class SingleDuplicateNumber {
    public static void main(String[] args) {
        int [] arr = {3,1,3,4,2};
        Arrays.sort(arr);
        System.out.println(test(arr));

    }
    public static int test(int[] arr){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return 0;
    }
}





/*
287. Find the Duplicate Number
Medium
17.9K
2.5K
Companies
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.



Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3

 */