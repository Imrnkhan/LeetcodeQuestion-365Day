package Coding_Question;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {4,2,5,7,1,8,9};
        System.out.println(Arrays.toString(test(arr)));

    }
    public static int[] test(int[] arr) {
        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;

    }
}
