package Leetcode;

public class EvenNumberDigit_Array {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(test(arr));

    }
    public static int test(int[] arr){
        int count =0;
        for(int i =0;i<arr.length;i++){
            if(Integer.toString(arr[i]).length()%2==0){
                count++;
            }
        }
        return count;
    }
}


/*
1295. Find Numbers with Even Number of Digits
Easy
1.8K
107
Companies
Given an array nums of integers, return how many of them contain an even number of digits.



Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1
Explanation:
Only 1771 contains an even number of digits.
 */