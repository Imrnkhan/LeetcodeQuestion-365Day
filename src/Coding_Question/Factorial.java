package Coding_Question;

public class Factorial {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        System.out.println(test(arr));
    }
    public static int test(int[] arr){
        int sum = 1;
        for(int i = 0;i<arr.length;i++){
            sum= sum*arr[i];
        }
        return sum;
    }
}


// factiriol with brute force this factor calculate in given array length