package Hackerrank;

import java.util.Scanner;

public class SalesByMatch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         int[] freq = new int[101];
         int n = s.nextInt();

         // Count the occurrences of each color
         for (int i = 0; i < n; i++) {
             int x = s.nextInt();
             freq[x]++;
         }

         int pairs = 0;

         // Calculate the number of pairs
         for (int i = 1; i < 101; i++) {
             pairs += freq[i] / 2;
         }

         System.out.println(pairs);
     }
    }


//given no. make 2 ka pair