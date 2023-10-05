package GeekForGeek;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveNegativeLast {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
        System.out.println(Arrays.toString(test(arr)));
    }
    public static int[] test(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                list.add(arr[i]);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
