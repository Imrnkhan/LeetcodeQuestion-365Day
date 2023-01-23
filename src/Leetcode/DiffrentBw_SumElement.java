package Leetcode;

public class DiffrentBw_SumElement {
    public static void main(String[] args) {
        int[] arr = {1,15,6,3};
        System.out.println(DiffSum(arr));
    }
    public  static int DiffSum(int[]arr){
        int sum = 0;
        int Dsum =0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            while (arr[i]!=0){
                Dsum+=arr[i]%10;
                arr[i]=arr[i]/10;
            }
        }
        return(Math.abs(Dsum-sum));
    }
}








/*

    You are given a positive integer array nums.

        The element sum is the sum of all the elements in nums.
        The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
        Return the absolute difference between the element sum and digit sum of nums.

        Note that the absolute difference between two integers x and y is defined as |x - y|.



        Example 1:

        Input: nums = [1,15,6,3]
        Output: 9
        Explanation:
        The element sum of nums is 1 + 15 + 6 + 3 = 25.
        The digit sum of nums is 1 + 1 + 5 + 6 + 3 = 16.
        The absolute difference between the element sum and digit sum is |25 - 16| = 9.
        Example 2:

        Input: nums = [1,2,3,4]
        Output: 0
        Explanation:
        The element sum of nums is 1 + 2 + 3 + 4 = 10.
        The digit sum of nums is 1 + 2 + 3 + 4 = 10.
        The absolute difference between the element sum and digit sum is |10 - 10| = 0.

 */
