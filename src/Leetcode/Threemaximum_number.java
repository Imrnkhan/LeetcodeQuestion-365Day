package Leetcode;
import java.util.*;
public class Threemaximum_number {
    public static void main(String[] args) {


        int[] V = {11, 65, 193, 36, 209, 664, 32};

        // sorting the array
        Arrays.sort(V);

        // taking the length of array
        int x = V.length;

        System.out.println( V[x - 3]+" "+V[x - 2]+" "+V[x - 1]);


    }
}