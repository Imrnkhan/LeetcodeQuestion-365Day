package Leetcode;

import java.util.*;

public class Third_maximumNumber {
    public static void main(String[] args) {
        int[] arr = {3,2,1};

        // 3rd largest = 1

        System.out.println(test(arr));
    }
    public static int test(int[]arr){
        Arrays.sort(arr); // largest numbers will be at the end

        List<Integer> hs = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
            if (!hs.contains(arr[i]))
                hs.add(arr[i]); // add only to the list if it is not already there

        // reminder: this list is already sorted, so the maximum numbers are at the end of the list
        if (hs.size() < 3)
            return hs.get(hs.size() - 1); // if the size is less than 3, get the last element
        else
            return hs.get(hs.size() - 3);


    }
}




//        HashSet<Integer> hs = new HashSet<>();
//        for(int i=0;i<arr.length;i++){
//            hs.add(arr[i]);
//        }
//        List<Integer> hd = new ArrayList<>();
//        Collections.sort(hd);
//        if(hd.size()<3){
//            return hd.get(hd.size()-1);
//        }
//        return hd.get(hd.size()-3);




/*
    Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
        Example 1:

        Input: nums = [3,2,1]
        Output: 1
        Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2.
        The third distinct maximum is 1.
        Example 2:

        Input: nums = [1,2]
        Output: 2
        Explanation:
        The first distinct maximum is 2.
        The second distinct maximum is 1.
        The third distinct maximum does not exist, so the maximum (2) is returned instead.
        Example 3:

        Input: nums = [2,2,3,1]
        Output: 1
        Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2 (both 2's are counted together since they have the same value).
        The third distinct maximum is 1.

 */