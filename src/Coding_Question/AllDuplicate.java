package Coding_Question;

import java.util.*;

public class AllDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(test(arr));
    }
    public static Set<Integer> test(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i =0;i<nums.length;i++) {
            if (!seen.add(nums[i])) {
                duplicates.add(nums[i]);
            }
        }

        return duplicates;
    }
}


// print all duplicate number of array ki andeer jo duplicate value hi

/*
442. Find All Duplicates in an Array
Medium
8.3K
309
Companies
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.



Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
Example 2:

Input: nums = [1,1,2]
Output: [1]
Example 3:

Input: nums = [1]
Output: []
 */