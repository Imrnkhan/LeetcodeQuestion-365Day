package BinarySearchProblem;

public class SearchInsertedPosition {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int k =2;
        System.out.println(test(arr,k));
    }
    public static int test(int[] arr,int k){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }
}


// ham ko weh index find krna hi jo jis number ko find kr rehe hi









/*
35. Search Insert Position
Easy
12.6K
552
Companies
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 */