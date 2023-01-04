package Leetcode;

import java.util.Arrays;

public class Single_Number_AppersOnce {
    public static void main(String[] args) {
        int[] arr = {2,2,1,6,7,7,6,1,8};
        Arrays.sort(arr);
        System.out.println(test(arr));
    }
    public static Integer test(int[]arr){
 for(int i =0;i<arr.length-1;i+=2){
     if(arr[i]!=arr[i+1]){
         return arr[i];
     }
 }
 return arr[arr.length-1];

    }
}





/*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

        You must implement a solution with a linear runtime complexity and use only constant extra space.



        Example 1:

        Input: nums = [2,2,1]
        Output: 1
        Example 2:

        Input: nums = [4,1,2,1,2]
        Output: 4
        Example 3:

        Input: nums = [1]
        Output: 1

 */