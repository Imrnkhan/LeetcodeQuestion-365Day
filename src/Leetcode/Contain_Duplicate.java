package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class Contain_Duplicate {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        System.out.println(test(arr));
    }

    public static boolean  test(int[] arr){
        Set<Integer> hs= new HashSet<>();
        for(int i =0;i<arr.length;i++){
            if(!hs.add(arr[i])){
                return true;
            }
        }
        return false;
    }
}




/*
217. Contains Duplicate
Easy
8.1K
1.1K
Companies
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.



Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */