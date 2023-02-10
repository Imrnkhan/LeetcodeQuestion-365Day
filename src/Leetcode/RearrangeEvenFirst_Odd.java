package Leetcode;

import java.util.Arrays;

public class RearrangeEvenFirst_Odd {
    public static void main(String[] args) {
        int[] arr = { 15, 9, 1, 3, 10, 5, 4, 8 };
        System.out.println(Arrays.toString(test(arr)));
    }
    public static int[] test(int[] arr){
        int[] ans = new int[arr.length];
        int count =0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0)
                ans[count++] = arr[i];

            }
            for(int j =0;j<arr.length;j++){
                if(arr[j]%2==1)
                    ans[count++] = arr[j];

        }
        return ans;
    }
}


//even
//odd