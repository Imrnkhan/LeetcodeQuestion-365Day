package JavaGudia_Question;

public class Check_Leap_Year {
    public static void main(String[] args) {
          int year = 2000;
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
            System.out.println("leap year");
        }
        else {
            System.out.println("not leap");
        }

            }
    }



    // this year not leep year because this year not divide not an 4