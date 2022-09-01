package time_handling;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class format_date_time {
    public static void main(String[] args) {
        DateTimeFormatter obj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime ds = LocalDateTime.now();
        System.out.println(ds);

         String s = ds.format(obj);
        System.out.println(s);



//        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        LocalDateTime current = LocalDateTime.now();
//        System.out.println(current);
//        String udf= current.format(formatObj);
//        System.out.println(udf);
    }
}
