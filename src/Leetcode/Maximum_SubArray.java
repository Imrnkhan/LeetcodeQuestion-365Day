package Leetcode;

public class Maximum_SubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(test(arr));

    }
    public static int test(int[]arr){
        int max = Integer.MIN_VALUE;     //-2147483647
        int sum = 0;

        for(int i =0;i<arr.length;i++){
            sum+=arr[i];
            if(max<sum)
                max = sum;
            if(sum<0)
                sum = 0;
        }
        return max;
    }
}



/*
53. Maximum Subarray
Medium
27.6K
1.2K
Companies
Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.



Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.


Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104


Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
/*
-2
-2 1
-2 1 -3
-2 1 -3 4
-2 1 -3 4 -1
-2 1 -3 4 -1 2
-2 1 -3 4 -1 2 1
-2 1 -3 4 -1 2 1 -5
-2 1 -3 4 -1 2 1 -5 4
1
1 -3
1 -3 4
1 -3 4 -1
1 -3 4 -1 2
1 -3 4 -1 2 1
1 -3 4 -1 2 1 -5
1 -3 4 -1 2 1 -5 4
-3
-3 4
-3 4 -1
-3 4 -1 2
-3 4 -1 2 1
-3 4 -1 2 1 -5
-3 4 -1 2 1 -5 4
4
4 -1
4 -1 2
4 -1 2 1     // this is the longest subarray sum =6
4 -1 2 1 -5
4 -1 2 1 -5 4
-1
-1 2
-1 2 1
-1 2 1 -5
-1 2 1 -5 4
2
2 1
2 1 -5
2 1 -5 4
1
1 -5
1 -5 4
-5
-5 4
4

 */