package ArrayList_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_to_Arraylist {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};

        List<Integer> hs = new ArrayList();
       for(int i =0;i<arr.length;i++){
           hs.add(arr[i]);

       }
           System.out.println(hs);
    }
}

//Array to arraylist make  way
//Collections.addAll()
//        Arrays.asList()