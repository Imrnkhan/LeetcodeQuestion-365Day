package Leetcode;

import java.time.LocalDate;

public class DayOfWeek1185 {
    public static void main(String[] args) {
        int day = 31, month = 8, year = 2019;
        System.out.println(test(day,month,year));
    }
    public static String test(int day, int month, int year) {

        LocalDate dt = LocalDate.of(year, month, day);
        String ans =dt.getDayOfWeek().toString();
        return ans.substring(0,1).toUpperCase() + ans.substring(1).toLowerCase();
    }
}



/*
1185. Day of the Week
Easy
322
2.2K
Companies
Given a date, return the corresponding day of the week for that date.

The input is given as three integers representing the day, month and year respectively.

Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.



Example 1:

Input: day = 31, month = 8, year = 2019
Output: "Saturday"
Example 2:

Input: day = 18, month = 7, year = 1999
Output: "Sunday"
Example 3:

Input: day = 15, month = 8, year = 1993
Output: "Sunday"
 */