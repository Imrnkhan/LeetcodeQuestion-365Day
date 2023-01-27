package Leetcode;

import java.util.Arrays;

public class Largest_PositiveIntegerNegative {
    public static void main(String[] args) {
        int[] arr = {-1,2,-3,3};
        Arrays.sort(arr);                    //sort = -3,1-,2,3
        System.out.println(test(arr));
    }
    public static int test(int[] arr){
  for(int i =0;i<arr.length;i++){
      for(int j = arr.length-1;j>=0;j--){
          if(arr[i]+arr[j]==0){
              return arr[j];
          }
      }
  }
        return -1;
    }
}



//[-1,2,-3,3]




/*
2441. Largest Positive Integer That Exists With Its Negative
Easy
304
5
Companies
Given an integer array nums that does not contain any zeros, find the largest positive integer k such that -k also exists in the array.

Return the positive integer k. If there is no such integer, return -1.



Example 1:

Input: nums = [-1,2,-3,3]
Output: 3
Explanation: 3 is the only valid k we can find in the array.
Example 2:

Input: nums = [-1,10,6,7,-7,1]
Output: 7
Explanation: Both 1 and 7 have their corresponding negative values in the array. 7 has a larger value.
Example 3:

Input: nums = [-10,8,6,7,-2,-3]
Output: -1
Explanation: There is no a single valid k, we return -1.

 */