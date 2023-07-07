package GeekForGeek;

import java.util.Arrays;

public class SortStringAlphabetically {
    public static void main(String[] args) {
        String str = "alnmbcdkjhpoiuy";

        System.out.println(test(str));
    }
    public static String test(String str){
        char[]ans = str.toCharArray();
        Arrays.sort(ans);
        return new String(ans);
    }
}
