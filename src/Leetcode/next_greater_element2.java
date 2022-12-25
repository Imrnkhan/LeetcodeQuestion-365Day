package Leetcode;

import java.util.Arrays;

public class next_greater_element2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,3};

        System.out.println(Arrays.toString(element(arr)));
    }
    public static int[] element(int[]arr){
        int [] res = new int[arr.length];
        for(int i =0;i<arr.length;i++){
            res[i] =-1;
            for(int j=1;j<arr.length;j++){
                if(arr[(i+j)%arr.length]>arr[i]){
                    res[i] = arr[(i+j)%arr.length];

                    break;
                }
            }
        }
        return res;

//        System.out.println(res);
    }
}
