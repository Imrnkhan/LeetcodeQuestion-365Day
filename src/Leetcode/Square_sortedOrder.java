package Leetcode;

import java.util.Arrays;

public class Square_sortedOrder {
    public static void main(String[] args) {
        int [] arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(test(arr)));
    }
    public static int[] test(int[] arr){
        for(int i =0;i<arr.length;i++){
            arr[i] = arr[i]*arr[i];

        }
        Arrays.sort(arr);
        return arr;
    }
}




/*
977. Squares of a Sorted Array
Easy
7.3K
181
Companies
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.



Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */