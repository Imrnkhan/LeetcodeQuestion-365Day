package JavaGudia_Question;

import java.util.Arrays;

public class LastThreeElementArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        test(arr);
    }
    public static void test(int[] arr){
        int[] ans = Arrays.copyOfRange(arr,2,5);
        System.out.println(Arrays.toString(ans));
    }
}
