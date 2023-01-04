package JavaGudia_Question;

public class Check_Leap_Year {
    public static void main(String[] args) {
          int year = 2022;
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println("leap year");
        }
        else {
            System.out.println("not leap");
        }

            }
    }

