package ArrayList_Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Arrays_to_Set {
    public static void main(String[] args) {
        ArrayList<String> hs = new ArrayList<>(Arrays.asList("red","green","blue","white"));
        System.out.println(hs);

//   same ans way   Set==============
//Using constructor
        Set<String> sh = new HashSet<>(hs);
        System.out.println(sh);
//=================================================
//add all method


        Set<String> cd = new HashSet<>();
        cd.addAll(hs);

//        =====================================================
//        using stream java 8
        Set<String>sd = hs.stream().collect(Collectors.toSet());
        System.out.println(sd);

//        =======================================
        Set<String> hg = new HashSet<>();
        for(String x:hs){
            hg.add(x);
        }
            System.out.println(hg);
    }
}
