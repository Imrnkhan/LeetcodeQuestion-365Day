package Coding_Question;

import java.util.Collections;
import java.util.PriorityQueue;

public class Kth_smallest {
    public static void main(String[] args) {
        int[] nums = {7 ,10, 4, 3, 20, 15};
        int k = 3;
        System.out.println(findKthLargest(nums,k));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> ans = new PriorityQueue<Integer>(Collections.reverseOrder());
        for(int i =0;i<nums.length;i++){
            ans.add(nums[i]);
            if(ans.size() > k)//always keep track of the kth largest using the queue
                ans.remove();
        }
        return ans.remove();
    }
    }

    // 20,15 ,10,7,4,3
// k =3
//other way to reverse the arr and = arr[arr-k]