package Leetcode;

public class Number_Goodpair {
    public static void main(String[] args) {
        int[]arr = {1,2,3,1,1,3};
        test(arr);
        }
        public static void test(int[]arr){

        int count =0;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}


//1,2,3,1,1,3
//        (0,3)-1,1
//        (0,4)-1,1
//        (3,4)-1,1
//        (2,5)-3,3

/*


    Given an array of integers nums, return the number of good pairs.

        A pair (i, j) is called good if nums[i] == nums[j] and i < j.



        Example 1:

        Input: nums = [1,2,3,1,1,3]
        Output: 4
        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
        Example 2:

        Input: nums = [1,1,1,1]
        Output: 6
        Explanation: Each pair in the array are good.
        Example 3:

        Input: nums = [1,2,3]
        Output: 0

 */