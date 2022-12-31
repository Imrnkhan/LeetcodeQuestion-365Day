package Coding_Question;

import java.util.Arrays;

public class merge_array {
    public static void main(String[] args) {
        int[] arr1 = {4,3,2,1};
        int[] arr2 = {5,6,7,8,6,9};
        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));

    }
    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int ans[] = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            ans[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            ans[arr1.length + i] = arr2[i];
        }
        Arrays.sort(ans);
        return ans;
    }

}
