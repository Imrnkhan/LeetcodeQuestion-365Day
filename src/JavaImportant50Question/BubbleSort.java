package JavaImportant50Question;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {7,4,1,56,7,8,3,5,9};
           test(arr);
        System.out.println(Arrays.toString(arr));

//        for(int i =0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");

//        }
    }
    public static void test(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 ; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}


//    i is used to iterate through the array from index 0 to nums.length - 1, ensuring that
//    every element is traversed at least once.
//
//        j is used within the inner loop to compare adjacent elements (at indices j and j + 1) and
//        swap them if necessary, effectively "bubbling up" the largest element to its correct position
//        in each iteration of the outer loop.