package JavaGudia_Question;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String str = "hello Welcome from india";
        String[] ans = str.split("\\s");
        for(int i =0;i<ans.length;i++){
            System.out.println(ans[i]);
        }


    }
}

