package Functional_programingDay13;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class pridicate {
    public static void main(String[] args) {
        Predicate<Integer> ps =  (i)->i>0;{
            System.out.println(ps.test(10));
            System.out.println(ps.test(-10));

//=============================================================================
//            supplior interface in functional
            Supplier<String> hs = () ->"welcome user";

            System.out.println(hs.get());
        }

    }
}
