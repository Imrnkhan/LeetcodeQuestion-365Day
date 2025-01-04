package CodeForces;

import java.util.Arrays;

public class MergeSortedArrays {

    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Compare elements from both arrays and merge them in sorted order
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1, if any
        while (i < n) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2, if any
        while (j < m) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};

        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.println("Merged array: " + Arrays.toString(mergedArray));
    }
}
