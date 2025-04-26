package Java8Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {
    public static void main(String[] args) {
        List<Integer> hs = Arrays.asList(1,2,3,4,5,6);
        List<Integer> even = hs.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(even);
    }
}
