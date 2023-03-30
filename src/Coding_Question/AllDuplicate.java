package Coding_Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(test(arr));
    }
    public static List<Integer> test(int[]arr) {
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length-1;i++)
            if(arr[i] == arr[i+1])
                list.add(arr[i]);

        return list;

    }
}


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