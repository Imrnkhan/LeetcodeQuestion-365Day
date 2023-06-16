package JavaGudia_Question;

import java.util.Arrays;

public class FirstThreeElementArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        test(arr);
    }
    public static void test(int[] arr){
        int[] ans = Arrays.copyOfRange(arr,0,3);

        System.out.println(Arrays.toString(ans));
    }
}


//this is the index basic
// given arr and start point,end point

//
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
//        int length = 3;
//
//        int[] firstThree = Arrays.copyOfRange(numbers, 0, length);
//
//        System.out.println(Arrays.toString(firstThree));
//    }
//}
