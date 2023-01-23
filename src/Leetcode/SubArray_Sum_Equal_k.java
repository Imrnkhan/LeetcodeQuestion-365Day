package Leetcode;

public class SubArray_Sum_Equal_k {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        int k =3;
        System.out.println(test(arr,k));

    }
    public static int test(int[]arr, int k){
        int count =0;
        for(int i =0;i<arr.length;i++){
            int sum =0;
            for(int j =i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    count++;
                }
            }
        }

        return count;
    }
}
