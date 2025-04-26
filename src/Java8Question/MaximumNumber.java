package Java8Question;

import java.util.Arrays;
import java.util.List;

public class MaximumNumber {
    public static void main(String[] args) {
        List<Integer> hs = Arrays.asList(14,34,56,78,99);
        int number = hs.stream().max(Integer::compare).get();

        System.out.println(number);
    }
}
