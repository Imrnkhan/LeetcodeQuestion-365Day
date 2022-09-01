package time_handling;

import java.awt.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class adding_month {
    public static void main(String[] args) {
        LocalDate ds = LocalDate.now();
        LocalDate t = ds.plusMonths(3);

        LocalDate dd = ds.plus(3, ChronoUnit.MONTHS);

        System.out.println(dd);

        System.out.println(t);

        

    }
}
