package Leetcode;

public class SumAbsoluteDiffPrime {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 12};
        System.out.println(test(arr));
    }
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int test(int[]arr){
        int sum =0;
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(isprime(j-i)){
                 sum+=Math.abs(arr[i]-arr[j]);
                }
            }
        }
        return sum;
    }
}

