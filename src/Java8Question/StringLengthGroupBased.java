package Java8Question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringLengthGroupBased {

    public static void main(String[] args) {
        List<String> hs = Arrays.asList("Java", "Stream", "API", "Code", "Fun");
        Map<Integer,List<String>> groupLength = hs.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupLength);
    }
}
