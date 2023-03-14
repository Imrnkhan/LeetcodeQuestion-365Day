package BinarySearchProblem;

public class FindSingleElementNotTwice {
    public static void main(String[] args) {
        int [] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println(test(arr));
    }
    public static int test(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] != arr[start + 1]) {
                return arr[start];
            }
            if (arr[end] != arr[end - 1]) {
                return arr[end];
            }
            start += 2;
            end -= 2;
        }
        return arr[start];
    }
    }



// weh element find krna hi jis kio twice nhi ho





// when print multiple itema presnt on not twice flow this way
/*
 public static int findDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (mid % 2 == 1) {
                mid--; // ensure mid is even
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
 */



/*
540. Single Element in a Sorted Array
Medium
8.8K
132
Companies
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.



Example 1:

Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
Example 2:

Input: nums = [3,3,7,7,10,11,11]
Output: 10
 */