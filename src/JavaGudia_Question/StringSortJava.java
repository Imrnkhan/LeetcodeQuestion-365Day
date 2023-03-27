package JavaGudia_Question;

import java.util.Arrays;

public class StringSortJava {
    public static void main(String[] args) {
        String str = "edcba";
        test(str);
    }
    public static void test(String str ){
        char[] ans = str.toCharArray();
        Arrays.sort(ans);

        System.out.println(ans);
    }
}
