package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOccurrences1207 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        System.out.println(test(arr));
    }
    public static boolean test(int[] arr){
        Map<Integer,Integer> hs = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> mp = new HashSet<>();
        for(int count: hs.values()){
            if(!mp.add(count)){
                return false;
            }
        }
        return true;
    }
}


/*
1207. Unique Number of Occurrences
Easy
3.4K
75
Companies
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.



Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true

 */