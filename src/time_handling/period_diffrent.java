package time_handling;

import java.time.LocalDate;
import java.time.Period;

public class period_diffrent {
    public static void main(String[] args) {
        LocalDate ds = LocalDate.now();
        System.out.println(ds);

        LocalDate d = LocalDate.of(1994,10,04);

        Period p = Period.between(ds,d);
//        Period m = Period.ofWeeks(7);

        System.out.println(p);

//        System.out.println(m);
    }
}
