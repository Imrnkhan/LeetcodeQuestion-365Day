package time_handling;

//
//Let’s create an application, in which ask the user to enter his date of birth in the form of
//        string
//        (dd-MM-yyyy), and print the name of Day of his date of birth.
//

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class day_of_birth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
        String dob = sc.next();
        DateTimeFormatter obj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            LocalDate ds = LocalDate.parse(dob, obj);

            String rs = ds.format(DateTimeFormatter.ofPattern("EEEE"));

            System.out.println(rs);
        } catch (Exception e) {
            System.out.println("enter the valid format");
        }

    }
}
