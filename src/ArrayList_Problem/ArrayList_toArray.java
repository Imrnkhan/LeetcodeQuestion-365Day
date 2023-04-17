package ArrayList_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



//other way

public class ArrayList_toArray{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // Add elements to the list
        list.add(5);
        list.add(10);
        list.add(15);

        // Convert ArrayList to Array
        Integer[] arr = list.toArray(new Integer[list.size()]);

        // Print the array
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

