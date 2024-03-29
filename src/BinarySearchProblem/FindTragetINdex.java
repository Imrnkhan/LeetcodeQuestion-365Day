package BinarySearchProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTragetINdex {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};
        int k = 5;
        System.out.println(test(arr,k));
    }
    public static List<Integer> test(int[] arr, int k){
        List<Integer> hs = new ArrayList<>();
        Arrays.sort(arr);
        for(int i =0;i< arr.length;i++){
            if(arr[i]==k){
                hs.add(i);
            }
        }

        return hs;
    }
}

  // sort the arr and find the target index of element 
/*
2089. Find Target Indices After Sorting Array
Easy
1.3K
58
Companies
You are given a 0-indexed integer array nums and a target element target.

A target index is an index i such that nums[i] == target.

Return a list of the target indices of nums after sorting nums in non-decreasing order. If there are no target indices, return an empty list. The returned list must be sorted in increasing order.



Example 1:

Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.
Example 2:

Input: nums = [1,2,5,2,3], target = 3
Output: [3]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 3 is 3.
Example 3:

Input: nums = [1,2,5,2,3], target = 5
Output: [4]
Explanation: After sorting, nums is [1,2,2,3,5].
The index where nums[i] == 5 is 4.

 */