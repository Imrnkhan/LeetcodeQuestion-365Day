package Zap;

import java.util.Arrays;


public class Practice {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 9, 3, 6};
        test(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static int[] test(int[] arr) {
         for(int i =0;i<arr.length;i++){
             int min =i;
             for(int j =i+1;j<arr.length;j++){
                 min =j;
                 if(arr[min]<arr[i]){
                     int temp =arr[min];
                     arr[min] = arr[i];
                     arr[i] = temp;
                 }
             }
         }
        return arr;
    }
}





