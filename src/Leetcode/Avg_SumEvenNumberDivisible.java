package Leetcode;

public class Avg_SumEvenNumberDivisible {
    public static void main(String[] args) {
        int[] arr = {1,3,6,10,12,15};
        //divisible number =3
        System.out.println(test(arr));
    }
    public static int test(int[] arr){
        int sum = 0;
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0 && arr[i]%3==0){
                sum+=arr[i];
                count++;

            }
        }
        if(count==0){
            return 0;
        }
        return Math.round(sum/count);
    }
}




/*
2455. Average Value of Even Numbers That Are Divisible by Three
Easy
190
20
Companies
Given an integer array nums of positive integers, return the average value of all even integers that are divisible by 3.

Note that the average of n elements is the sum of the n elements divided by n and rounded down to the nearest integer.



Example 1:

Input: nums = [1,3,6,10,12,15]
Output: 9
Explanation: 6 and 12 are even numbers that are divisible by 3. (6 + 12) / 2 = 9.
Example 2:

Input: nums = [1,2,4,7,10]
Output: 0
Explanation: There is no single number that satisfies the requirement, so return 0.



 */