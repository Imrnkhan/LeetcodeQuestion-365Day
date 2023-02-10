package Leetcode;

import java.util.Arrays;

public class PrintFirstOdd_Even {
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        System.out.println(Arrays.toString(test(arr)));

    }
    public static int[] test(int[] arr){
        int left =0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]%2==1 && arr[right]%2==0){
                int temp = arr[left];
                arr[left] =arr[right];
                arr[right] = temp;
            }
            if(arr[left]%2==0) left++;
        if(arr[right]%2==1) right--;
        }
        return arr;
    }
}


//frist pritn even than odd


/*
905. Sort Array By Parity
Easy
4.2K
133
Companies
Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

Return any array that satisfies this condition.



Example 1:

Input: nums = [3,1,2,4]
Output: [2,4,3,1]
Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
Example 2:

Input: nums = [0]
Output: [0]
 */