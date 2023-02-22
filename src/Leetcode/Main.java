package Leetcode;
//
//public class Longest_Increase_SubArray {
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 1, 2, 3,1};
//    }
//    public static int  test(int[] arr){
//        int ans = 1;
//        for(int i =0;i<arr.length;i++){
//            int count = 1;
//            for(int j =i+1;j<arr.length;j++){
//                if(arr[i]<arr[j-1]){
//                    count++;
//                    if(count<ans){
//                        ans = count;
//                    }
//                }
//
//            }
//        }
//
//    }
//}
import java.util.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] sides = new int[n][2];
        for (int i = 0; i < n; i++) {
            sides[i][0] = scanner.nextInt();
            sides[i][1] = scanner.nextInt();
        }
        System.out.println(nearlySimilarRectangles(sides));
    }

    public static int nearlySimilarRectangles(int[][] sides) {
        int count = 0;
        for (int i = 0; i < sides.length - 1; i++) {
            for (int j = i + 1; j < sides.length; j++) {
                double ratio1 = (double) sides[i][0] / sides[j][0];
                double ratio2 = (double) sides[i][1] / sides[j][1];
                if (ratio1 == ratio2) {
                    count++;
                }
            }
        }
        return count;
    }
}

