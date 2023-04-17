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




/*



Write a class Main, in which define a static method called getEligibility.
the return type of this method should be void and it takes one parameter as int age.
If the supplied age is less than 18 then throw an ArithmeticException class object with the
message “Invalid age”.
If the age is greater than 18 then print the message “You are Eligible”.
from the main method of Main class, prompt the user to Enter the age using Scanner class.
call the getEligibility method inside the try-catch block from the main method by passing
user-entered age


import java.util.Scanner;

public class Main {

    public static void getEligibility(int age) {
        if (age < 18) {
            throw new ArithmeticException("Invalid age");
        } else {
            System.out.println("You are Eligible");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            getEligibility(age);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

 */
