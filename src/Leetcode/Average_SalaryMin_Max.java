package Leetcode;

import java.util.Arrays;

public class Average_SalaryMin_Max {
    public static void main(String[] args) {
        int[]arr = {4000,3000,1000,2000};
        Arrays.sort(arr);
        System.out.println(test(arr));


    }
    public static double  test(int[] arr) {
        double sum = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            sum += arr[i];

        }
        return (sum/(arr.length-2));
    }
}


/*
1491. Average Salary Excluding the Minimum and Maximum Salary
Easy
1.1K
128
Companies
You are given an array of unique integers salary where salary[i] is the salary of the ith employee.

Return the average salary of employees excluding the minimum and maximum salary. Answers within 10-5 of the actual answer will be accepted.



Example 1:

Input: salary = [4000,3000,1000,2000]
Output: 2500.00000
Explanation: Minimum salary and maximum salary are 1000 and 4000 respectively.
Average salary excluding minimum and maximum salary is (2000+3000) / 2 = 2500
Example 2:

Input: salary = [1000,2000,3000]
Output: 2000.00000
Explanation: Minimum salary and maximum salary are 1000 and 3000 respectively.
Average salary excluding minimum and maximum salary is (2000) / 1 = 2000
 */