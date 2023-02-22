package Coding_Question;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[]arr = {6,3,5,7,89,1,2,3};

        System.out.println(Arrays.toString(test(arr)));

    }
    public static int[] test(int[]arr) {
        for(int i =0;i<arr.length;i++){
            int min =i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min =j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
