package Java8Question;

import java.util.Arrays;
import java.util.Comparator;

public class Testing {
    public static void main(String[] args) {
        int[]arr = {1,2,85,4,6,7,8,1,6,5,4,33,99};

       int[] ans =  Arrays.stream(arr).sorted().toArray();
        System.out.println(ans);
    }
}
