package Java8Question;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyWord {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");
        Map<String, Long> wordFrequency = words.stream()

                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(wordFrequency);
    }
}
