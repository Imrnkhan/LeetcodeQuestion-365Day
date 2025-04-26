package Java8Question;

import java.util.Arrays;
import java.util.List;

public class CountStringPrefix {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("Alice", "Bob", "Annie", "Alex", "Charlie");
        long count = str.stream().filter(name->name.startsWith("A")).count();
        System.out.println(count);
    }
}
