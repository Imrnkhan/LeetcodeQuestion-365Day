package Zap;

import javafx.util.Pair;

import java.util.Arrays;

public class Min_Max {
    public static void main(String[] args) {
        int[] arr = {54, 546, 548, 60};
        Pair<Integer, Integer> result = test(arr);
        int min = result.getKey();
        int max = result.getValue();

        System.out.println(min);
        System.out.println(max);
    }
    public static Pair test(int[] arr){

            int min = arr[0];
            int max = arr[0];

            for (int i = 1; i < arr.length; i++) {
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
            }

            return new Pair<>(min, max);
    }
}


