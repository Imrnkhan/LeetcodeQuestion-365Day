package Leetcode;

public class ContainDupilcate_II_K {
    public static void main(String[] args) {
        int [] arr = {1,2,3,1};
        int k =3;
        System.out.println(test(arr,k));
    }
    public static boolean test(int[]arr,int k){
        for(int i =0;i<arr.length-1;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    if(Math.abs(i-j)<=k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}


/*
219. Contains Duplicate II
Easy
4.5K
2.5K
Companies
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.



Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true
Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false

 */