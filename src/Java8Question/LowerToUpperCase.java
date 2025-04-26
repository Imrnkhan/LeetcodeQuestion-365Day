package Java8Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LowerToUpperCase {
    public static void main(String[] args) {
        List<String> hs = Arrays.asList("java", "stream", "api");

        List<String> uppercase = hs.stream().map(String::toUpperCase).collect(Collectors.toList());

        System.out.println(uppercase);

    }
}
