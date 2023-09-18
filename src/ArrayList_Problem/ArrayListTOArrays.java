package ArrayList_Problem;

import java.util.ArrayList;

public class ArrayListTOArrays {
    public static void main(String[] args) {
        ArrayList<Integer> hs = new ArrayList<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);

        // Convert ArrayList to int array
        int[] arr = new int[hs.size()];
        for (int i = 0; i < hs.size(); i++) {
            arr[i] = hs.get(i);
        }

        // Print the int array
        for (int i =0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
