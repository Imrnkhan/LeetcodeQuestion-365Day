package Zap;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {7, 2, 9, 4, 1};
        System.out.println(test(arr));
    }

    public static int test(int[] arr) {
        int totalans = 0;
        // Calculate strength for each element
        for (int i = 0; i < arr.length; i++) {
            int res = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    res++;
                }
            }
            totalans += res;
        }
        return totalans;
    }
}

//this question asking Globalogic test
/*
SELECT employee_number, first_name, last_name
FROM employees
WHERE last_name LIKE 'S%' OR last_name LIKE '%a'
LIMIT 20;

 */