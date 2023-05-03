package Zap;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int k = 9;
        System.out.println(test(arr, k));
    }

    public static int test(int[] arr, int k) {
 int start = 0;
 int end = arr.length-1;
 while (start<end ){
     int mid = start+(end-start)/2;
     if(arr[mid]==k){
         return mid;
     } else if (arr[mid]<k) {
         start = mid+1;

     }
     else {
         end = mid-1;
     }
 }
        return -1;
    }

}
