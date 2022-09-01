package com.Fourth;

public class Number {
    /*
    Write a non-static method inside a java class that accepts a whole number and prints
the same number if the input is Odd. If the input is even, it should print the next multiple
of ten. If the input is negative, print the string: “Error”.
Input: 44, output: 50
Input: 45, output: 45
Input: -5, output: Error
     */

    public static void check(int number) {
//        int number = 29;

        if(number<0){
            System.out.println("error");
        } else if (number%2==0) {
//            int i = 10 * 10 + 10;
            System.out.println(number/10*10+10);
        } else if (number%2==1) {
            System.out.println(number);

        }
    }

    public static void main(String[] args) {
        check(29);


        //both are same work
//        Number n1 = new Number();
//        n1.check(29);
    }
}
