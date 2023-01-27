package Leetcode;

public class Monotonic_Arrays {
    public static void main(String[] args) {
        int [] arr ={1,2,2,3};
        System.out.println(test(arr));

    }
    public static boolean  test(int[] arr){
        boolean inc = true;
        boolean dec = true;
        for(int i =1;i<arr.length;i++){
            if(arr[i]>arr[i-1]) dec = false;
            if(arr[i]<arr[i-1]) inc = false;
        if(inc==false && dec==false){
            return false;
        }
        }
        return true;
    }
}



/*
896. Monotonic Array
Easy
1.9K
61
Companies
An array is monotonic if it is either monotone increasing or monotone decreasing.

An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].

Given an integer array nums, return true if the given array is monotonic, or false otherwise.



Example 1:

Input: nums = [1,2,2,3]
Output: true
Example 2:

Input: nums = [6,5,4,4]
Output: true
Example 3:

Input: nums = [1,3,2]
Output: false

 */