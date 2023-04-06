package JavaGudia_Question;

import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicate_Set {
    public static void main(String[] args) {
        int[] arr = {52,14,65,1,2,3,5,6,2,3,6,4,8,};
        System.out.println(duplicate(arr));
    }
    public static Set duplicate(int[] arr){
        Set hs = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        return hs;
    }

}
