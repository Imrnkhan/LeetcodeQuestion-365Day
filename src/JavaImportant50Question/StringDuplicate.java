package JavaImportant50Question;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicate {
    public static void main(String[] args) {
        String str = "bcabc";


        System.out.println(test(str));
    }
    public static String test(String str) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }

}
