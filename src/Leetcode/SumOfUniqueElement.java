package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SumOfUniqueElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2};
        System.out.println(test(arr));
    }
    public static int test(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        List<Integer> ls = new ArrayList<>();
        int res = 0;
        for(int i =0;i<arr.length;i++){
            if(!hs.contains(arr[i])){
                hs.add(arr[i]);
            }
            else {
                ls.add(arr[i]);
            }
        }
        for(int i =0;i<arr.length;i++){
            if(!ls.contains(arr[i])){
                res+=arr[i];
            }
        }
        return res;
    }
}




/*
1748. Sum of Unique Elements
Easy
1.1K
23
Companies
You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.

Return the sum of all the unique elements of nums.



Example 1:

Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.
Example 2:

Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.
Example 3:

Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

 */