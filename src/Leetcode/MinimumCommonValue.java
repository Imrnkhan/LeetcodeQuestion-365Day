package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValue {
    public static void main(String[] args) {
        int[]arr1 = {1,2,3};
        int[]arr2 = {2,4};
        System.out.println(test(arr1,arr2));
    }
    public static int test(int[]arr1,int[]arr2){
        Set<Integer> hs = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }
        for(int j =0;j<arr2.length;j++){
            if(hs.contains(arr2[j])){
                return arr2[j];
            }
        }
        return -1;
    }
}







/*
step 1. hashset
2 loop and add value arr1
3 again loop and check 2nd arr2
4. and return arr2
5 if not return -1
 */







/*
2540. Minimum Common Value
Easy
338
4
Companies
Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.



Example 1:

Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.
Example 2:

Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2
Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.

 */