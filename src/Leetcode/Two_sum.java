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
