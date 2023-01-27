package Leetcode;

import java.util.Arrays;

public class ValidAnagran_Digit {
    public static void main(String[] args) {
        int A = 204;
        int B = 270;
        System.out.println(test(A,B));
    }
    public static boolean test(int A, int B){

        // Converting numbers to strings and convert Charater Array
        char[] c = (String.valueOf(A)).toCharArray();
        char[] d = (String.valueOf(B)).toCharArray();

        // Checking if the sorting values
        // of two strings are equal
        Arrays.sort(c);
        Arrays.sort(d);

        return Arrays.equals(c,d);
    }
}


/*
Input: A = 204, B = 240
Output: Yes

Input: A = 23, B = 959
Output: No
 */