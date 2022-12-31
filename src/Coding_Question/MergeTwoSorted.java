package Coding_Question;

import java.util.Arrays;
// Java program to merge two sorted arrays
//using maps
import java.io.*;
import java.util.*;

public class MergeTwoSorted {

    // Function to merge arrays
    static void mergeArrays(int nums1[], int nums2[], int m, int n){

        // Declaring a map.
        // using map as a inbuilt tool
        // to store elements in sorted order.
        Map<Integer,Boolean> h1 = new TreeMap<Integer,Boolean>();

        // Inserting values to a map.
        for(int i = 0; i < m; i++){
            h1.put(nums1[i], true);
        }
        for(int i = 0;i < n;i++){
            h1.put(nums2[i], true);
        }

        // Printing keys of the map.
        System.out.println("Array after merging");
        for (Map.Entry<Integer,Boolean> me : h1.entrySet()){
            System.out.print(me.getKey() + " ");
        }
    }

    // Driver Code
    public static void main (String[] args){
        int nums1[] = {1, 3, 5, 7}, nums2[] = {2, 4, 6, 8};
        int size = nums1.length;
        int size1 = nums2.length;

        // Function call
        mergeArrays(nums1, nums2, size, size1);
    }
}
