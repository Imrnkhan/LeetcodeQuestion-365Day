package time_handling;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class date_format {
    public static void main(String[] args) {

    DateTimeFormatter obj  = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    LocalDateTime ds = LocalDateTime.now();
        System.out.println(ds);

        String s = ds.format(obj);
        System.out.println(s);
    }
}
