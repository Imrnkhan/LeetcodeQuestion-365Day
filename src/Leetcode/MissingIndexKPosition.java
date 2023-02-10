package Leetcode;

public class MissingIndexKPosition {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(test(arr,k));
    }
    public static int test(int[]arr,int k){
        for(int i =0;i<arr.length;i++){
            if(arr[i]<=k){
            k++;
            }
        }
        return k;
    }
}

// es arr ko complete = 1,2,3,4,5,6,7,8,9,10,11
//my arr = 2,3,4,7,11
//hole mising = 1,5,6,8,9,10
// find index mising number = 5th index =>9


/*
1539. Kth Missing Positive Number
Easy
3.6K
259
Companies
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Return the kth positive integer that is missing from this array.



Example 1:

Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
Example 2:

Input: arr = [1,2,3,4], k = 2
Output: 6
Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.
 */