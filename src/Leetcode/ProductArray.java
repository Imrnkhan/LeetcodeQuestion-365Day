package Leetcode;


import java.util.Arrays;

class ProductArray{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};

//        System.out.println(Arrays.toString(test(arr)));
        int[] output = test(arr);
        for(int i =0;i< output.length;i++){
            System.out.print(output[i]+" ");
        }
    }
    public static int[] test(int[] arr){
        int[] output = new int[arr.length];
        int prev = 1;
        for(int i=0;i<arr.length;i++){
            output[i] = prev;
            prev *= arr[i];
        }
        prev = 1;
        for(int i= arr.length-1;i>=0;i--){
            output[i] = output[i]*prev;
            prev *= arr[i];
        }
        return output;
    }
}

//
//      arr[1] = nums[2]*nums[3]*nums[4] = 24
//
//        arr[2] = nums[1]*nums[3]*nums[4] = 12
//
//        arr[3] = nums[1]*nums[2]*nums[4] = 8
//
//        arr[4] = nums[1]*nums[2]*nums[3] = 6

/*
238. Product of Array Except Self
Medium
16.3K
905
Companies
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */