package Java8Question;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacterOccurrenceEach {

    public static void main(String[] args) {
        String input = "gainjavaknowledge";

        Map<String, Long> output = Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Output : "+output);

    }
}