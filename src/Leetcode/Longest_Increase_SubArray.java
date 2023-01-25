//package Leetcode;
//
//public class Longest_Increase_SubArray {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 1, 2, 3,1};
//    }
//    public static int  test(int[] arr){
//        int ans = 1;
//        for(int i =0;i<arr.length;i++){
//            int count = 1;
//            for(int j =i+1;j<arr.length;j++){
//                if(arr[i]<arr[j-1]){
//                    count++;
//                    if(count<ans){
//                        ans = count;
//                    }
//                }
//
//            }
//        }
//
//    }
//}
