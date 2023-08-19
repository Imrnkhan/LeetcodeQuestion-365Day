package JavaImportant50Question;

import java.util.HashSet;
import java.util.Set;

public class FindFristDuplicateNumber {
    public static void main(String[] args) {
        int [] arr = {5,3,1,3,4,2,5};
        System.out.println(test(arr));

    }
    public static int test(int []arr){
        Set<Integer> hs = new HashSet<>();
        for(int i =0;i< arr.length;i++){
            if(hs.contains(arr[i])){
                return arr[i];
            }
            hs.add(arr[i]);
        }
        return -1;
    }
}



//    HashSet<Integer> set = new HashSet<>();
//
//        for (int num : arr) {
//                if (!set.contains(num)) {
//                set.add(num);
//                } else {
//                set.remove(num);
//                }
//                }
//
//                if (set.size() == 1) {
//                for (int num : set) {
//                return num;
//                }
//                }
//
//                return -1; // No sin


// this algo work on the frist come duplicate single number

/*
287. Find the Duplicate Number
Medium
18.5K
2.7K
Companies
Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.



Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3
 */