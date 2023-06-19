package JavaGudia_Question;

import java.util.Arrays;

public class AllSubArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j <= arr.length; j++) {
                int[] subarray = Arrays.copyOfRange(arr, i, j);
                printSubarray(subarray);
            }
        }
    }

    public static void printSubarray(int[] subarray) {
        for (int i = 0; i < subarray.length; i++) {
            System.out.print(subarray[i] + " ");
        }
        System.out.println();
    }
}




// another way 3 lopp subaaray print n2
/*
for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }
 */