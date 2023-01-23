package Leetcode;

import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(test(arr)));

    }
    public static int[] test(int[] arr){
        int j =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[j];
                arr[j]= arr[i];
                arr[i] = temp;
                j++;
            }
        }


        return arr;
    }
}





/*
283. Move Zeroes
Easy
12.4K
314
Companies
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */