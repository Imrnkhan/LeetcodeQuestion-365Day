package Leetcode;

import java.util.Arrays;


public class CountPairWhoseSumLessK {
    public static void main(String[] args) {
        int[] nums = {-1, 1, 2, 3, 1};
        int target = 2;

        System.out.println(countPairs(nums, target));
    }

    public static int countPairs(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] + nums[right] < target) {
                count += right - left;
                left++;
            } else {
                right--;
            }
        }

        return count;
    }
}
