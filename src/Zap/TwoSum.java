package Zap;

import java.util.*;

public class TwoSum {



        public static void main(String[] args){
           int [] nums = {2,7,11,15};
           int target = 9;
            System.out.println(test(nums, target));
                }

    public static String test(int[] nums, int target) {
        HashMap<Integer, Integer> tracker = new HashMap<Integer, Integer>();
        int len = nums.length;
        for(int i = 0; i < len; i++){
            if(tracker.containsKey(nums[i])){
                int left = tracker.get(nums[i]);
                return left + " " + i;
            }else{
                tracker.put(target - nums[i], i);
            }
        }
        return "-1 -1";
    }
            }





