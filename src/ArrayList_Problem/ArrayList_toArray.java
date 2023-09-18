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


/*
import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        // Convert ArrayList to int array
        int[] array = new int[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            array[i] = arrayList.get(i);
        }

        // Print the int array
        for (int i =0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}

 */
