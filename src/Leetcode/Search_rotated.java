package Leetcode;

public class Search_rotated {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,3,2};
        int k = 3;
        System.out.println(search(arr,k));
    }
    public  static int search(int[]arr, int k){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}


//this Ques find the arr of index in value k