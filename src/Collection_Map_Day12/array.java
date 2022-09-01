package Collection_Map_Day12;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class array {
    public static void main(String[] args) {
        int[] arr = {10,2,5,12,15,16,7,6};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


//        2nd part
//
        List<Integer> ls = Arrays.asList(10,2,5,12,15,16,7,6);

        System.out.println(ls);

        Collections.sort(ls);  //sort
        System.out.println(ls);

        Collections.reverse(ls); //reverse
    }
}
