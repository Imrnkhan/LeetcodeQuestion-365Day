package Leetcode;

import java.util.Arrays;

public class SortOddEvenElement {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7};
        System.out.println(Arrays.toString(test(arr)));

    }
    public static int[] test(int[]arr){
        int[]ans = new int[arr.length];
        int odd = 1;
        int even = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
            ans[even] = arr[i];
            even+=2;
            }else {


            ans[odd] = arr[i];
            odd+=2;
            }
        }
        return ans;
    }
}





// sort this way one odd and one even arr

/*
922. Sort Array By Parity II
Easy
2.2K
82
Companies
Given an array of integers nums, half of the integers in nums are odd, and the other half are even.

Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.

Return any answer array that satisfies this condition.



Example 1:

Input: nums = [4,2,5,7]
Output: [4,5,2,7]
Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
Example 2:

Input: nums = [2,3]
Output: [2,3]
 */