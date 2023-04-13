package Leetcode;

public class FindLuckyNumber {
    public static void main(String[] args) {
        int [] arr = {2,2,3,4};
        System.out.println(test(arr));
    }
    public static int test(int[]arr){
        int[] ans = new int[501];        // max size of cnostrant
        for(int i =0;i<arr.length;i++){
            ans[arr[i]]++;
                }
            for(int j = ans.length-1;j>=0;j--){
                if(ans[j]==j){
                    return j;
            }
        }
        return -1;
    }
}











/*
1394. Find Lucky Integer in an Array
Easy
942
26
Companies
Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.

Return the largest lucky integer in the array. If there is no lucky integer return -1.



Example 1:

Input: arr = [2,2,3,4]
Output: 2
Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
Example 2:

Input: arr = [1,2,2,3,3,3]
Output: 3
Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
Example 3:

Input: arr = [2,2,2,3,3]
Output: -1
Explanation: There are no lucky numbers in the array.
 */