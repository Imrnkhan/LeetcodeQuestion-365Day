package JavaImportant50Question;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {7,4,1,56,7,8,3,5,9};
//        System.out.println(Arrays.toString(test(arr)));
           test(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void test(int[] arr) {
        int i;
        for (i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }
}
