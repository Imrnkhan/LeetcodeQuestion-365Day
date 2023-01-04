package Leetcode;

import java.util.Arrays;

public class SortByArray_Odd_Even {
    public static void main(String[] args) {
        int []arr = {3,1,2,4};
        System.out.println(Arrays.toString(test(arr)));
    }
    public static int[] test(int[] arr){
        int[] ans = new int[arr.length];
        int odd =0;
        int even = arr.length-1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                ans[odd++]=arr[i];

            }
            else {
                ans[even--] = arr[i];
            }
        }
        return ans;
    }
}








//    Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//
//        Return any array that satisfies this condition.
//
//
//
//        Example 1:
//
//        Input: nums = [3,1,2,4]
//        Output: [2,4,3,1]
//        Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//        Example 2:
//
//        Input: nums = [0]
//        Output: [0]