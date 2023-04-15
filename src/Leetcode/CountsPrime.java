package Leetcode;

public class CountsPrime {
    public static void main(String[] args) {
        int n =10;
        System.out.println(test(n));

    }
    public static int test(int n){
        int count =0;
        for(int i =2;i<n;i++){
            if(isprime(i)){
                count++;
            }
        }
        return count;
    }
    private static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
}





/*
204. Count Primes
Medium
6.7K
1.3K
Companies
Given an integer n, return the number of prime numbers that are strictly less than n.



Example 1:

Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:

Input: n = 0
Output: 0
Example 3:

Input: n = 1
Output: 0
 */