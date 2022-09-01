package ArrayList_Problem;

import java.util.*;
import java.util.stream.Collectors;

public class Set_to_Arrayslist {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>();
        hs.add("one");
        hs.add("two");
        hs.add("Three");
        hs.add("four");
        hs.add("five");

        System.out.println(hs);

//        ===========================================
//Stream using java 8
        List<String> ls = hs.stream().collect(Collectors.toList());
        System.out.println(ls);



//        ====================================================
        ArrayList<String> hd = new ArrayList<>();
        for(String str:hs){
            hd.add(str);
        }
            System.out.println(hd);
    }
}
