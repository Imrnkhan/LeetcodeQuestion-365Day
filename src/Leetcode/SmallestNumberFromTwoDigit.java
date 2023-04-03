package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class SmallestNumberFromTwoDigit {
    public static void main(String[] args) {
        int[] num1 = {4,1,3};
        int []num2 = {5,7};
        System.out.println(test(num1,num2));
    }
    public static int test(int[]num1,int[]num2){
        Arrays.sort(num1);
        Arrays.sort(num2);

        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<num1.length;i++){
            hs.add(num1[i]);

        }
        for(int i=0;i<num2.length;i++){
            if(hs.contains(num2[i])){
                return num2[i];
            }
        }
        if(num1[0]<num2[0]){
            return num1[0]*10+num2[0];
        }
        return num2[0]*10+num1[0];
    }
}







/*
2605. Form Smallest Number From Two Digit Arrays
Easy
105
4
Companies
Given two arrays of unique digits nums1 and nums2, return the smallest number that contains at least one digit from each array.


Example 1:

Input: nums1 = [4,1,3], nums2 = [5,7]
Output: 15
Explanation: The number 15 contains the digit 1 from nums1 and the digit 5 from nums2. It can be proven that 15 is the smallest number we can have.
Example 2:

Input: nums1 = [3,5,2,6], nums2 = [3,1,7]
Output: 3
Explanation: The number 3 contains the digit 3 which exists in both arrays.

 */