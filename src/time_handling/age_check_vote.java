package time_handling;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class age_check_vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
        String dob = sc.next();
        try{
            LocalDate d1 = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
           DateTimeFormatter ds = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            LocalDate c1 = LocalDate.now();
            Period p = Period.between(d1,c1);
            if(p.getYears() >= 18)
                System.out.println("You are Eligible to Vote");
            else
                System.out.println("Sorry you are not eligible to Vote");
        }catch (Exception e){
            System.out.println("Please enter Date of bith in valid pattern");
        }
    }
}
