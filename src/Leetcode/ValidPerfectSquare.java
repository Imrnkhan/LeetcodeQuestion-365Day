package Leetcode;

public class ValidPerfectSquare {
    public static void main(String[] args) {

    int num = 16;
        System.out.println(test(num));
    }
    public static boolean test(int num ){
        int i =1;
        while (num>0){
            num= num-i;
            i= i+2;
        }
        if(num==0){
            return true;
        }
        else {
            return false;
        }
    }
}

//         16 - 1 = 15  => num = 16, i= 1
//        15 - 3 = 12   => num = 15, i = 3;
//        12 - 5 = 7    => num = 12, i =5;
//        7 - 7 = 0      => num = 7, i =7
// conditon true when in last num ==0



/*
367. Valid Perfect Square
Easy
3.6K
280
Companies
Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.



Example 1:

Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
Example 2:

Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

 */