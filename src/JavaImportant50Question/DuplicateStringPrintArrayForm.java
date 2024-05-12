package JavaImportant50Question;

import java.util.HashSet;
import java.util.Set;

// print the all duplicate character in this string Arrays format
public class DuplicateStringPrintArrayForm {
    public static void main(String[] args) {
        String str = "Imrankhan";
        System.out.println(test(str));
    }

    public static String test(String str) {

        Set<Character> hs = new HashSet<>();
        Set<Character> hd = new HashSet<>();

//        for (char c : str.toCharArray()) {
        for(int i =0;i<str.length();i++){


            if (!hs.add(str.charAt(i))) {
                // If it's not possible to add the character to the set, it's a duplicate
                hd.add(str.charAt(i));
            }
        }


        return hd.toString();

    }
}


//explain
/*
    Initialize str with "Imrankhan".
        test method is called with "Imrankhan".
        Sets hs and hd are initialized as empty sets.
        Iterating over each character in "Imrankhan":
        i = 0, str.charAt(i) = 'I': 'I' is added to hs.
        i = 1, str.charAt(i) = 'm': 'm' is added to hs.
        i = 2, str.charAt(i) = 'r': 'r' is added to hs.
        i = 3, str.charAt(i) = 'a': 'a' is added to hs.
        i = 4, str.charAt(i) = 'n': 'n' is added to hs.
        i = 5, str.charAt(i) = 'k': 'k' is added to hs.
        i = 6, str.charAt(i) = 'h': 'h' is added to hs.
        i = 7, str.charAt(i) = 'a': 'a' cannot be added to hs (already present), so 'a' is added to hd.
        i = 8, str.charAt(i) = 'n': 'n' cannot be added to hs (already present), so 'n' is added to hd.
        Returns the set hd containing duplicate characters as a string: "[a, n]".


 */


