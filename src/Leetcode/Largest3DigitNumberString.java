package Leetcode;

import java.util.List;

public class Largest3DigitNumberString {
    public static void main(String[] args) {
        String str = "6777133339";
        System.out.println(test(str));
    }
    public static String test(String num) {
        if(num.contains("999")) return "999";
        else if(num.contains("888")) return "888";
        else if(num.contains("777")) return "777";
        else if(num.contains("666")) return "666";
        else if(num.contains("555")) return "555";
        else if(num.contains("444")) return "444";
        else if(num.contains("333")) return "333";
        else if(num.contains("222")) return "222";
        else if(num.contains("111")) return "111";
        else if(num.contains("000")) return "000";
        else return "";
    }
}



/*
2264. Largest 3-Same-Digit Number in String
Easy
293
19
Companies
You are given a string num representing a large integer. An integer is good if it meets the following conditions:

It is a substring of num with length 3.
It consists of only one unique digit.
Return the maximum good integer as a string or an empty string "" if no such integer exists.

Note:

A substring is a contiguous sequence of characters within a string.
There may be leading zeroes in num or a good integer.


Example 1:

Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
"777" is the largest, so we return "777".
Example 2:

Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.
Example 3:

Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
 */