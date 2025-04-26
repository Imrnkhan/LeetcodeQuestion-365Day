package Java8Question;

import java.util.Arrays;
import java.util.List;

public class ParallerStreamUseSum {
    public static void main(String[] args) {
        List<Integer> hs = Arrays.asList(1,2,3,4,5);
        int sum = hs.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
