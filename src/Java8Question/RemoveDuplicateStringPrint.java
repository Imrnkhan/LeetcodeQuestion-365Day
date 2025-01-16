package Java8Question;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicateStringPrint {
    public static void main(String[] args) {
        String str = "HelloWordDemo";

     String ans = Arrays.stream(str.split("")).distinct().sorted().collect(Collectors.toList()).toString();
        System.out.println(ans);
    }
}
/*
     String input = "aabscs";
    Arrays.stream(input.split(""))
      .collect(Collectors.toSet()).forEach(System.out::print);
 */