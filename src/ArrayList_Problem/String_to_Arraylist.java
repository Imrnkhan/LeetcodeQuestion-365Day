package ArrayList_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class String_to_Arraylist {
    public static void main(String[] args) {
        String res = "Study Tonight com";
        String dc[] = res.split(" ");

        List<String> hs = new ArrayList<>(Arrays.asList(dc));
        System.out.println(hs);

    }
}


//other number format===================
//public static void main(String args[]){
//    String strings = "99,42,55,81,79,64,22";
//    String str[] = strings.split(",");
//
//    List nl = new ArrayList();
//    nl = Arrays.asList(str);
//    for(String s: nl){
//        System.out.println(s);
//    }
//}