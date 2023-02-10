package Leetcode;

import java.util.Arrays;

public class Rearrange_Even_Odd_2ndway {
    public static void main(String[] args) {
        int[] arr = { 15, 9, 1, 3, 10, 5, 4, 8 };

            System.out.println(Arrays.toString(test(arr)));
    }
    public static int[] test(int[] arr){
        int j =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
        return arr;
    }
}


// 1st even start
//2nd odd strat