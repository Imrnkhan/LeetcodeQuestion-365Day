package Java8Question;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyCharacters {
    public static void main(String[] args) {
        String str = "success";
        Map<Character,Long> hs = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()));

        System.out.println(hs);


        // Step 2: Find the character with the maximum frequency
        Map.Entry<Character, Long> maxEntry = hs.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow(() -> new RuntimeException("String is empty"));

        System.out.println("Character with maximum frequency: " + maxEntry.getKey() + " (" + maxEntry.getValue() + " times)");
    }
}
