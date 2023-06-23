package ArrayList_Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {

    //You have an array of N integers, but you don't like this array much and you would like to have it reversed.
        public static void main(String[] args) {
            int[] arr = {2, 3, 5, 5, 1};
            test(arr);
        }

        public static void test(int[] arr) {
            List<Integer> hs = new ArrayList<>();

            for (int i = 0; i < arr.length; i++) {
                hs.add(arr[i]);
            }

            Collections.reverse(hs);

            for (int i = 0; i < arr.length; i++) {
                System.out.print(hs.get(i) + " ");
            }
        }
    }


//time & space = 0(n)

//

// use another way
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = scanner.nextInt();
//        }
//        for (int i = n - 1; i >= 0; i--) {
//            System.out.print(a[i] + " ");
//        }
//    }
//}

