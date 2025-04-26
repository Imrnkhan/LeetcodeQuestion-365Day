package Java8Question;


//Concatenate all strings in a list into a single string.

import java.util.Arrays;
import java.util.List;

public class AllStringintoSingleString {
    public static void main(String[] args) {
        List<String> hs = Arrays.asList("Stream", "API", "is", "powerful");
        String word = hs.stream().reduce("",(s1,s2)->s1+" "+s2).trim();
        System.out.println(word);
    }
}
