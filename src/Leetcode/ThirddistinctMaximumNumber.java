package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ThirddistinctMaximumNumber {
    public static void main(String[] args) {
        int[]arr = {3,2,1};
    }
    public static int thirdMax(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());  // sort and reverse
        if(list.size()<3){                                      // chota hi 3 se
            return list.get(0);
        }
        return list.get(2);                    //3rd coemaximum
    }
}


/*
414. Third Maximum Number
Easy
2.4K
2.8K
Companies
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