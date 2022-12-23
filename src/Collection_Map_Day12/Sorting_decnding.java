package Collection_Map_Day12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting_decnding {
    public static void main(String[] args) {
        List<Integer> hs= Arrays.asList(10,5,8,2,12,15,14,1,9);
        System.out.println("Before sorting List "+ hs);
        Collections.sort(hs);
        Collections.reverse(hs);
        System.out.println(hs);

    }
}
