package JavaImportant50Question;

import Demo.A;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
//        System.out.println(test(str1,str2));
        if (test(str1, str2)) {
            System.out.println("Yes");
        } else {
            System.out.println("NO");
        }
    }
    public static boolean test(String str1,String str2){
        char[] a1 = str1.toCharArray();
        char[]a2 = str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1,a2) ;
    }
}
