package Coding_Question;

import java.util.HashSet;
import java.util.Set;

public class SmallestMissingNumberTwoArray_A_B {
    public static void main(String[] args) {
        int[] arr1 = {3, 6, 7, 100, 12, 22, 12, 22};
        int[] arr2 = {12, 3, 6, 100, 40, 3, 50, 7};

        Set<Integer> set = new HashSet<>();

//        for (int i : b) {                //inhenced loop
        for(int i =0;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        int smallest = Integer.MAX_VALUE;
//        for (int i : a) {                  //inhenced loop
        for(int j =0;j<arr1.length;j++){
            if (!set.contains(arr1[j])) {

                smallest = Math.min(smallest, arr1[j]);
            }
        }

        if (smallest == Integer.MAX_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println("The smallest missing number is: " + smallest);
        }
    }
}


//Here's a Java code to find the smallest number present in array A but missing in array B,
// or return -1 if not present:
/*
In this code, a set is used to store unique elements from array B. For each element in array A,
if it's not present in the set, the minimum value of that element and smallest is calculated.
If smallest is not changed after looping through all elements in A, it means there is no missing
element and -1 is printed, otherwise, the value of smallest is the missing element from B.
 */
