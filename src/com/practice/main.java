package com.practice;
//
////Example: getting difference between 2 LocalDate object:
//import java.time.LocalDate;
//import java.time.Period;
//class magic {
//    public static void main(String args[]) {
//        LocalDate cdate = LocalDate.now();
//        LocalDate dob = LocalDate.of(1985, 02, 05);
//        Period diff = Period.between(cdate, dob);
//        System.out.println(diff);
//    }
//}
////output:
////        P-37Y-1M-10D


//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.Scanner;
//
//class Magic {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Date of birth in dd-MM-yyyy pattern");
//        String dob= sc.next();
//        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        try {
//            LocalDate date = LocalDate.parse(dob, dtf);
//            String result= date.format(DateTimeFormatter.ofPattern("EEEE"));
//            System.out.println("Your Birthday day is :"+result);
//        }catch (Exception e){
//            System.out.println("please pass the date in proper format");
//        }
//    }
//}


//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//
//class findFormt {
//    public static void main(String args[]) {
//        LocalDate date = LocalDate.now();
//        System.out.println("current date in default format: " + date);
//        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        String udf = date.format(formatObj);
//        System.out.println("current date in userdefined format: " + udf);
//
//    }
//}


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
class chang {
    public static void main(String args[]) {
        LocalDateTime oldDate = LocalDateTime.of(1982, 5, 31, 10, 20, 55);
        LocalDateTime newDate = LocalDateTime.of(2016, 9, 9, 10, 21, 56);
        System.out.println(oldDate);
        System.out.println(newDate);
        System.out.println(ChronoUnit.YEARS.between(oldDate, newDate) + " years");
        System.out.println(ChronoUnit.MONTHS.between(oldDate, newDate) + " months");
        System.out.println(ChronoUnit.WEEKS.between(oldDate, newDate) + " weeks");
        System.out.println(ChronoUnit.DAYS.between(oldDate, newDate)+ " days");
        System.out.println(ChronoUnit.HOURS.between(oldDate, newDate) + " hours");
        System.out.println(ChronoUnit.MINUTES.between(oldDate, newDate) + " minutes");
        System.out.println(ChronoUnit.SECONDS.between(oldDate, newDate) + " seconds");
        System.out.println(ChronoUnit.MILLIS.between(oldDate, newDate) + " milis");
        System.out.println(ChronoUnit.NANOS.between(oldDate, newDate) + " nano");
    }
}