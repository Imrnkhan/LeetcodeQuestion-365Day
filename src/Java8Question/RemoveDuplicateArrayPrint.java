package Java8Question;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateArrayPrint {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,2,3,4,5};

        int[] uniqueArray = Arrays.stream(arr).distinct().toArray();
        System.out.println(Arrays.toString(uniqueArray));

    }
}
