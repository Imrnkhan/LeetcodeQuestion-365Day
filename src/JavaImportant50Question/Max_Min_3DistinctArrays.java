package JavaImportant50Question;

import java.util.Arrays;
import java.util.Collections;

public class Max_Min_3DistinctArrays {
    public static void main(String[] args) {


        int[] arr = {5, 3, 7, 1, 8, 2, 9, 4, 6};
        Arrays.sort(arr);

        // Printing the 3 distinct minimum elements
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Printing the 3 distinct maximum elements
        for (int i = arr.length - 1; i >= arr.length - 3; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}



//Given an array of N integers, print the 3 distinct maximum and 3 distinct minimum elements of the array.