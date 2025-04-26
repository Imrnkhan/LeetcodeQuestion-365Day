package Java8Question;

import java.util.function.Predicate;

public class Pridicate {
    public static void main(String[] args) {
        Predicate<Integer> lesserthan = i -> (i < 18);
        System.out.println(lesserthan.test(18));
    }
}
