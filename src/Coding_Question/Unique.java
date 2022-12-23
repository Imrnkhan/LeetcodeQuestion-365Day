package Coding_Question;


import java.util.Arrays;
import java.util.HashSet;

public class Unique {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{52, 14, 65, 1, 2, 3, 5, 6, 2, 2, 3, 43, 6, 4, 8,};
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(solve(arr));

    }

    public static HashSet<Integer> solve(Integer[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        return set;

    }
}