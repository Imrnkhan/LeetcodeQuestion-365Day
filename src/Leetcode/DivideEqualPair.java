package Leetcode;

import java.util.Arrays;

public class DivideEqualPair {
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,2,2};

        System.out.println(test(arr));
    }
    public static boolean test(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i+=2){
            if(arr[i]!=arr[i+1]){
                return false;
            }
        }
        return true;
    }
}


// after sort = 2 2 2 2 3 3
