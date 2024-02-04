package Coding_Question;

import java.util.Arrays;

public class ProductofArraySelfExpect {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(test(arr)));

    }
    public static int[] test(int[]arr){
        int[] result = new int[arr.length];
        // Calculate the product of all elements to the left of each element
        int leftProduct = 1;
        for (int i = 0; i < arr.length; i++) {
            result[i] = leftProduct;
            leftProduct *= arr[i];
        }

        // Calculate the product of all elements to the right of each element and multiply it with the left product
        int rightProduct = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }
        return result;
    }
}
