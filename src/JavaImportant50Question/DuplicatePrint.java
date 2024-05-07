package JavaImportant50Question;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicatePrint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 2, 6, 8, 9, 4, 9};
      test(arr);
    }
     public static void test(int arr[]) {
         HashSet<Integer> hs = new HashSet<>();
         HashSet<Integer> hd = new HashSet<>();

         for (int i =0;i<arr.length;i++) {
             if (!hs.add(arr[i])) {
                 // num is a duplicate, but check if it is already in the duplicates set
                 if (hd.add(arr[i])) {
                     System.out.print(arr[i] + " ");
                 }
             }
         }
    }
}

// print all duplicate number
