package BinarySearchProblem;

import java.util.Arrays;

public class FindFristPosition_LastPosition {
    public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int k =8;
        System.out.println(Arrays.toString(test(arr, k)));
    }
    public static int[] test(int[] arr, int k){
        int[] ans = {-1,-1};
        for(int i =0;i<arr.length;i++){
            if(arr[i]==k){
                ans[0] = i;
                break;
            }
        }
        for( int i= arr.length-1;i>=0;i--){
            if(arr[i]==k){
                ans[1] =i;
                break;
            }
        }
        return ans;
    }
}


// time =O(n)

//main point where to start ok k elment and where to end print indexs
//exp = 1 2 2 3
//k = 2
// start =1, end = 2








/*
34. Find First and Last Position of Element in Sorted Array
Medium
16.2K
380
Companies
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 */