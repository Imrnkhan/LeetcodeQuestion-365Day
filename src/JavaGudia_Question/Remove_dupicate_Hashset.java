package JavaGudia_Question;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Remove_dupicate_Hashset {
    public static void main(String[] args) {
        int[] arr = {52,14,65,1,2,3,5,6,2,3,6,4,8,4};

      System.out.println(Duplicate(arr));


    }
    public static HashSet<Integer> Duplicate(int[] arr){
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            hs.add(arr[i]);

        }

        return hs;
    }
}
