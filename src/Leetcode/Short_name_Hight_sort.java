package Leetcode;

import java.util.Arrays;

public class Short_name_Hight_sort {
    public static void main(String[] args) {
        String[] str = {"Mary","John","Emma"};
        int[] arr = {180,165,170};
        System.out.println(Arrays.toString(test(str, arr)));
    }
    public static String[] test(String[] str, int[] arr){
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
//                    sort hight
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    //sort name decending order
                    String res = str[j];
                    str[j] = str[i];
                    str[i] = res;
                }
            }
        }
        return str;
    }
}





/*
2418. Sort the People
Easy
636
8
Companies
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.



Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.
 */