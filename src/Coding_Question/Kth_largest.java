package Coding_Question;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Kth_largest {
    public static void main(String[] args) {
        int[] arr = {3,2,1,7,8,6,4};
        int k =2;

        System.out.println(largest(arr,k));
    }
    public static int largest(int[]arr, int k){
        PriorityQueue<Integer> ans = new PriorityQueue<Integer>();
        for(int i =0;i<arr.length;i++){
            ans.add(arr[i]);
            if(ans.size() > k)//always keep track of the kth largest using the queue
                ans.remove();
        }
        return ans.remove();
    }
}

//another way to solve sort

//        Arrays.sort(arr);
//        return arr[arr.length-k];
//last se kon sa largest element hi 2nd position pe
