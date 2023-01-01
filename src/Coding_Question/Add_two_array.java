package Coding_Question;

import java.util.Arrays;

public class Add_two_array {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,6,5};
        int[] arr2 = {2,5,3,4,6};
        System.out.println(Arrays.toString(addAll(arr1, arr2)));
    }
    public static int[] addAll(int[] arr1, int[] arr2){

        int[] ans = new int[arr1.length];
        for(int i =0;i<arr1.length;i++){
            ans[i] = arr1[i]+arr2[i];
        }
        return ans;
    }


}
//    int[] a = {0, 1, 2};
//    int[] b = {3, 4, 5};
//    int[] c = new int[a.length];
//for (int i = 0; i < a.length; ++i) {
//        c[i] = a[i] + b[i];
//        }