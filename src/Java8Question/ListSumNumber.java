package Java8Question;

import java.util.Arrays;
import java.util.List;

public class ListSumNumber {
    public static void main(String[] args) {
        List<Integer> hs = Arrays.asList(1,2,3,4,5,6,7);
        int sum = hs.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
