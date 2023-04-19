package JavaImportant50Question;

import java.util.HashSet;
import java.util.Set;

public class RemoveAllDuplicateStringOrder {
    public static void main(String[] args) {
        String str = "iloveprogramming";
        test(str);
    }
    public static void test(String str){

        Set<Character> set = new HashSet<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (!set.contains(str.charAt(i))) {
                sb.append(str.charAt(i));
                set.add(str.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
