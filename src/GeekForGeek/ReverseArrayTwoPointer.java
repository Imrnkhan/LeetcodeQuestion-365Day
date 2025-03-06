package GeekForGeek;

import java.util.Arrays;

public class ReverseArrayTwoPointer {
    public static void main(String[] args) {
        int[] arr =  {2, 3, 4, 5, 67, 8};
        test(arr);
        System.out.println(Arrays.toString(arr)); // Printing the reversed array
    }

    public static void test(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Swap arr[left] with arr[right]
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move the pointers towards each other
            left++;
            right--;
        }
    }
}
