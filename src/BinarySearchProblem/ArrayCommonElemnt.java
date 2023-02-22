package BinarySearchProblem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayCommonElemnt {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {5,4,3,2,1,1};
        System.out.println(test(arr1,arr2));
    }
    public static ArrayList<Integer> test(int[] arr1, int[] arr2){
        Set<Integer> hs = new HashSet<>();
        for(int i =0;i< arr1.length;i++){
            hs.add(arr1[i]);
        }
        Set<Integer> hd = new HashSet<>();
        for(int i =0;i< arr2.length;i++){
            hd.add(arr2[i]);
        }
        hs.retainAll(hd);
        return new ArrayList<>(hs);
    }
}
