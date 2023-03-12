package BinarySearchProblem;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionTwoArrayII {
    public static void main(String[] args) {
        int [] arr1 = {1,2,2,1}, arr2 = {2,2};
        System.out.println(Arrays.toString(test(arr1, arr2)));
    }
    public static int[] test(int[] arr1,int[] arr2){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<Integer> hs = new ArrayList<>();
        int i =0;
        int j =0;
        while (i< arr1.length && j< arr2.length){
            if(arr1[i]==arr2[j]){
                hs.add(arr1[i]);
                
                i++;
                j++;
            } else if (arr1[i]<arr2[j]) {
                i++;
                
            }
            else {
                j++;
            }

        }

        //convert list to array
//        return hs.size();   // normal print arr only size =2

        int[] result = new int[hs.size()];
        for(int k =0;k< hs.size();k++){
            result[k] = hs.get(k);

        }

        return result;   //list to arr =[2,2]
    }
}




/*
350. Intersection of Two Arrays II
Easy
6.2K
839
Companies
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.



Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */
