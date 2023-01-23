package Leetcode;

public class Search_IndexPostion_k {
    public static void main(String[] args) {
        int[]arr = {0, 0, 1, 3, 5, 5, 6, 6, 6, 8};
        int k =8;
        System.out.println(test(arr,k));


    }
    public static int test(int[]arr, int k){       //this O(logN)
        int low = 0, high = arr.length-1;
             while(low<=high){
                 int mid = (low+high)/2;
                 if(arr[mid] == k) return mid;
                 else if(arr[mid] > k) high = mid-1;
                 else low = mid+1;
             }
             return low;
    }

}




//O(log) this
//        for(int i =0;i<arr.length;i++){
//            if(arr[i]==k){
//                return i;
//            }
//        }
//        return -1;


/*
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
