package GeekForGeek;

import java.util.HashSet;

public class DuplicateSingleNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 7, 1};
        System.out.println(test(arr));
    }
    public static int test(int[] arr){
        HashSet<Integer> hs = new HashSet<>();

        for (int i =0;i<arr.length;i++) {
            if (hs.contains(arr[i])) {
                return arr[i];
            }
            else {
                hs.add(arr[i]);
            }
        }

        return -1;
    }
}

/*
 HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) {   // If the number is already in the set, it's a duplicate
                return num;
            }
        }
        return -1; // No duplicates found
 */