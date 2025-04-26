package Java8Question;

import java.util.Arrays;
import java.util.List;

public class FindLongestString {
    public static void main(String[] args) {
        List<String> hs = Arrays.asList("Java", "Stream", "API", "Development");
        String longest = hs.stream().reduce((word1,word2)-> word1.length()>word2.length()? word1:word2).orElseThrow(null);

        System.out.println(longest);
    }
}
