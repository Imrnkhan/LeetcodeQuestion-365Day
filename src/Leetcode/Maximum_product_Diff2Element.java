package Leetcode;

public class Maximum_product_Diff2Element {
    public static void main(String[] args) {
        int []  arr = {3,4,5,2};
        System.out.println(test(arr));

    }
    public static int test(int[] arr){
        int ans = 0;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                int res = (arr[i]-1)*(arr[j]-1);
                ans = Math.max(ans,res);
            }
        }
        return ans;

    }
}





/*
1464. Maximum Product of Two Elements in an Array
Easy
1.4K
176
Companies
Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).


Example 1:

consdition is nums[i]-1)*(nums[j]-1 =>4-1*5-1 = 3*4 =12

Input: nums = [3,4,5,2]
Output: 12
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12.
Example 2:

Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
Example 3:

Input: nums = [3,7]
Output: 12
 */