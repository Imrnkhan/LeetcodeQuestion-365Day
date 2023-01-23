package Leetcode;

public class Count_Absulate_diff {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1};
        int k = 1;
        System.out.println(test(arr,k));

    }
    public  static int test(int[]arr,int k){
        int count = 0;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(Math.abs(arr[j]-arr[i])==k){
                    count++;
                }
            }
        }
        return count;
    }
}
