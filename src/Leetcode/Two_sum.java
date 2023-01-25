package Leetcode;

public class Two_sum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        test(arr,target);
    }
    public static void test(int[]arr,int target){
         for(int i =0;i<arr.length;i++){
             for(int j = i+1;j<arr.length;j++){
                 if(arr[i]+arr[j]==target){
                     System.out.println(i+" "+j);
                 }
             }
         }

    }
}



/*
//o(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}

 */