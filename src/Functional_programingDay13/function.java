package Functional_programingDay13;

import java.util.function.Function;

public class function {
    public static void main(String[] args) {
        Function<Integer,String> fs = (i)->"this is number: "+i;

        Function<String,Integer> hs = (i)->Integer.parseInt(i);

        System.out.println(hs.apply( "500")+200);

        System.out.println(fs.apply(10));

    }
}
