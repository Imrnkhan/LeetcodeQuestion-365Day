package Coding_Question;

import java.util.Arrays;

public class Squre_array {
    public static void main(String[] args) {
        int [] arr = {5,3,4,6,67,9};

        System.out.println(Arrays.toString(Squre(arr)));
    }
    public  static int[] Squre(int[] arr){
        Arrays.sort(arr);

        for(int i =0;i<arr.length;i++){
            arr[i] = arr[i]*arr[i];
        }
        return arr;
    }
}
