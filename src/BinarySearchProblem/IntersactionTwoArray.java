package BinarySearchProblem;

import java.util.*;

public class IntersactionTwoArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,2,1}, arr2 = {2,2};
        System.out.println(Arrays.toString(test(arr1, arr2)));

    }
    public static int[] test(int[] arr1, int[]arr2){
        Set<Integer> hs = new HashSet<>();
        List<Integer> hd = new ArrayList<>();

        for(int i =0;i< arr1.length;i++)
            hs.add(arr1[i]);
            for(int j =0;j< arr2.length;j++){
                if(hs.contains(arr2[j])){
                    hd.add(arr2[j]);
                    hs.remove(arr2[j]);
                }
            }
            int[]arr = new int[hd.size()];
            for(int k =0;k< hd.size();k++)
                arr[k] = hd.get(k);
                return arr;



    }
}








/*
349. Intersection of Two Arrays
Easy
4.4K
2.1K
Companies
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 */