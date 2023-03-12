package BinarySearchProblem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValueArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 7, 100, 12, 22, 12, 22};
        int[] arr2 = {12, 3, 6, 100, 40, 3, 50, 7};
        System.out.println(test(arr1,arr2));
    }
    public static int test(int [] arr1,int [] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Set<Integer> hs = new HashSet<>();
        for(int i =0;i<arr1.length;i++){
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


//if given arr in sorted order than not need sort to array









/*
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