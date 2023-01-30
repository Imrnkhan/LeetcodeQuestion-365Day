package Zap;

import java.util.Arrays;

class demo{
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};

//        System.out.println(Arrays.toString(test(arr)));
        int[] output = test(arr);
        for(int i =0;i< output.length;i++){
            System.out.print(output[i]+" ");
        }
    }
    public static int[] test(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int prev = 1;
        for(int i=0;i<n;i++){
            output[i] = prev;
            prev *= arr[i];
        }
        prev = 1;
        for(int i=n-1;i>=0;i--){
            output[i] = output[i]*prev;
            prev *= arr[i];
        }
        return output;
    }
}