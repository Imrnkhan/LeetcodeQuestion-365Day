package Leetcode;

import java.util.HashSet;

public class SingleRepeatedElement {
    public static void main(String[] args) {
        int[] arr = {5,1,5,2,5,3,5,4};
        System.out.println(test(arr));
    }
    public static int test(int[] arr){
        HashSet<Integer> hs =  new HashSet<>();
        for(int i =0;i<arr.length;i++){
            if(hs.contains(arr[i])){
                return arr[i];
            }
            else {
                hs.add(arr[i]);
            }
        }
        return 0;
    }
}




/*
961. N-Repeated Element in Size 2N Array
Easy
1.1K
314
Companies
You are given an integer array nums with the following properties:

nums.length == 2 * n.
nums contains n + 1 unique elements.
Exactly one element of nums is repeated n times.
Return the element that is repeated n times.



Example 1:

Input: nums = [1,2,3,3]
Output: 3
Example 2:

Input: nums = [2,1,2,5,3,2]
Output: 2
Example 3:

Input: nums = [5,1,5,2,5,3,5,4]
Output: 5
 */