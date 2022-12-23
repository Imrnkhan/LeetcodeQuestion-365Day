package Coding_Question;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Remove_duplicate {
    public static void main(String[] args) {

        Integer[] arr = new Integer[] {52,14,65,1,2,3,5,6,2,3,6,4,8,};
        Arrays.sort(arr);

//        System.out.println(Arrays.toString(arr));
        LinkedHashSet<Integer> hs = new LinkedHashSet<>(Arrays.asList(arr));
        Integer [] duplicate = hs.toArray(new Integer[] {});
        System.out.println(Arrays.toString(duplicate));
    }
}
