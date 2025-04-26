package Java8Question;

import java.util.Arrays;
import java.util.List;

public class CheckStringMatch {

    public static void main(String[] args) {
        List<String> hs = Arrays.asList("Java", "Stream API", "Lambda");
        boolean containsString = hs.stream().anyMatch(s->s.contains("API"));
        System.out.println(containsString);
    }
}
