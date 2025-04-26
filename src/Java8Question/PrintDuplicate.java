package Java8Question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicate {
    public static void main(String[] args) {
        List<Integer> hs = Arrays.asList(1, 2, 3, 4, 2, 5, 1);
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicate = hs.stream().filter(n->!unique.add(n)).collect(Collectors.toSet());
        System.out.println(duplicate);

    }
}
