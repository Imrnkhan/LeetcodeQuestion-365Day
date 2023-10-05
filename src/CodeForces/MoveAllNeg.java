package CodeForces;

import java.util.Arrays;

public class MoveAllNeg {
    public static void main(String[] args) {
        int arr[] = {2, 4, -10, 13, -7, -60, 52, 8, -19};
        System.out.println(Arrays.toString(test(arr)));
    }

    public static int[] test(int[] arr) {
        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        return arr;
    }
}

