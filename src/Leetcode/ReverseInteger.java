package Leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        int arr = 123;
        System.out.println(test(arr));
    }
    public static int test(int arr){
        int res = 0;
        while (arr!=0){
            if(res*10/10!=res)
                return 0;
            res = 10*res+arr%10;
            arr = arr/10;
        }
        return res;
    }
}




/*
. Reverse Integer
Medium
10.1K
11.8K
Companies
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).



Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 */