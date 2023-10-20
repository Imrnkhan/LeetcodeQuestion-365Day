package GeekForGeek;

public class KadaneAlgo {
    public static void main(String[] args) {
        int [] arr = {1,2,3,-2,5};
        System.out.println(test(arr));
    }
    public static int test(int[]arr){
        int MaxSum = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            int sum = 0;
            for(int j =i;j<arr.length;j++){
                sum+=arr[j];
                MaxSum = Math.max(sum,MaxSum);

            }
        }
        return MaxSum;
    }
}





/*
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number)
which has the maximum sum and return its sum.
 */