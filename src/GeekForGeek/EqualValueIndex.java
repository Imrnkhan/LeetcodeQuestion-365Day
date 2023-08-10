package GeekForGeek;

import java.util.ArrayList;

public class EqualValueIndex {
    public static void main(String[] args) {
        int[]arr = {15, 2, 45, 12, 7};
        System.out.println(test(arr));
    }
    public static ArrayList<Integer> test(int[] arr){
        ArrayList<Integer> hs = new ArrayList<>();
        for(int i =0;i< arr.length;i++){
            if(arr[i]==i+1){
                hs.add(i+1);
            }
        }
        return hs;
    }
}


//condition yeh hi ager arr[i]==i+1 if true and print
// arr[i]==i+1   => 15==0+1 False
//arr[i] ==i+1    => 2==1+1 true
// than  print i+1 because  i want to print value is equal to index

/*
Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).

Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.

Example 1:

Input:
N = 5
Arr[] = {15, 2, 45, 12, 7}
Output: 2
Explanation: Only Arr[2] = 2 exists here.
 */