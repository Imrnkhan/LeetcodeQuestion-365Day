package JavaImportant50Question;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DuplicatePrint {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 2, 6, 8, 9, 4, 9};
      test(arr);
    }
     public static void test(int arr[]) {
         HashSet<Integer> seen = new HashSet<>();
         HashSet<Integer> duplicates = new HashSet<>();

         for (int num : arr) {
             if (!seen.add(num)) {
                 // num is a duplicate, but check if it is already in the duplicates set
                 if (duplicates.add(num)) {
                     System.out.print(num + " ");
                 }
             }
         }
    }
}

// print all duplivate number
