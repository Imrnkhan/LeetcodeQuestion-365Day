package GeekForGeek;

import java.util.Arrays;

public class Minimize_the_Heights {
    public static void main(String[] args) {
        int[] arr = {3, 9, 12, 16, 20};
        int k = 3;
        System.out.println(test(arr,k));

    }
    public  static int test(int[]arr,int k){
        Arrays.sort(arr);
        int minHeight = arr[0] + k; // Minimum height after possible increase
        int maxHeight = arr[arr.length - 1] - k; // Maximum height after possible decrease

        return Math.max(0, maxHeight - minHeight);
    }
}


// arr[0]+k => 3+3= 6
//arr[arr.length-1]-k => 20-3 = 17
// 17-6 = 11

//this Question gfg but not sumbit