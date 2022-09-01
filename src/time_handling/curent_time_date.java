package time_handling;

import javax.sound.sampled.FloatControl;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class curent_time_date {
    public static void main(String[] args) {
//        LocalDate date = LocalDate.now();
//        System.out.println(date);


//        LocalTime t = LocalTime.now();
//        System.out.println(t);


//        LocalDateTime c = LocalDateTime.now();
//        System.out.println(c);
//
//        LocalDate d = LocalDate.of(1996,02,25);
//        System.out.println(d);


//        LocalDate yestarday = date.minusDays(1);
//        System.out.println(yestarday);


//        LocalDate tommrow = yestarday.plusDays(1);
//        System.out.println(tommrow);

//
//        LocalDate ds = LocalDate.of(1997,06,15);
//        System.out.println("leap year: "+ds.isLeapYear());
//
//        LocalDate ms = LocalDate.of(1996,9,16);
//        System.out.println("this is Leap year: "+ms.isLeapYear());


        LocalDate ids = LocalDate.of(1996,9,16);
        LocalDateTime dateTime =ids.atTime(12,15,26);
        System.out.println(dateTime);

    }
}
