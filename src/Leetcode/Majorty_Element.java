package Leetcode;

import java.util.Arrays;

public class Majorty_Element {
    public static void main(String[] args) {
        int [] arr = {3,2,3};
        System.out.println(test(arr));

    }
    public static int test(int[] arr){
        Arrays.sort(arr);
        int mid = arr.length/2;
        return arr[mid];
    }
}
//n(logn)
//[2,2,1,1,1,2,2]
//arr.length  = 7%2 = Rem =1 index position = >2 ans

//Another solu

/*
 public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
        int max=0;
        int n=0;
        for(int i=0;i<nums.length;i++)  {
            if(hmap.containsKey(nums[i]))    {
                hmap.put(nums[i],hmap.get(nums[i])+1);
            }
            else    {
                hmap.put(nums[i],1);
            }
            if(hmap.get(nums[i])>max)   {
                max=hmap.get(nums[i]);
                n=nums[i];
            }
        }
        return n;
    }
 */


/*
169. Majority Element
Easy
13.4K
424
Companies
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.



Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2

 */