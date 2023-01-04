package JavaGudia_Question;

import java.util.Scanner;

public class Number_positive_Negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int n = sc.nextInt();
        if(test(n))
            System.out.println("positive");
        else
            System.out.println("negative");

    }
    public static boolean test(int n){
        if(n>=0){
            return true;
        }
        else {
            return false;
        }
    }
}
