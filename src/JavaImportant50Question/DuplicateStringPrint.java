package JavaImportant50Question;

import java.util.HashSet;
import java.util.Set;

public class DuplicateStringPrint {
    public static void main(String[] args) {
        String str = "Imrankhan";
        test(str);
    }

    public static void test(String str) {

        Set<Character> hs = new HashSet<>();
        Set<Character> hd = new HashSet<>();

//        for (char c : str.toCharArray()) {
            for(int i =0;i<str.length();i++){


            if (!hs.add(str.charAt(i))) {
                // If it's not possible to add the character to the set, it's a duplicate
                hd.add(str.charAt(i));
            }
        }

        for (char c : hd) {
            System.out.print(c);
        }
    }
}


