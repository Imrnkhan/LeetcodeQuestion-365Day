package time_handling;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class parsing_method {
    public static void main(String[] args) {
//        String dob = "05/02/1985";
//        LocalDate id = LocalDate.parse(dob,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
//        System.out.println(id);

        String dob="05/02/1985";
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate ld=LocalDate.parse(dob,dtf);
        System.out.println(ld);
    }
}
