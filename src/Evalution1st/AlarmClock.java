package Evalution1st;


public class AlarmClock {
    int day = 0;
    boolean x = true;
    void vacation(int day , boolean x) {
        if(day>6 || day<0) {
            System.out.println("error");
        }
        else {
            if(day==0 ||day==6) {
                if(x==true) {
                    System.out.println("off");

                }
                else {
                    System.out.println("10:00");
                }
            }
            else {
                if(x==true) {
                    System.out.println("10:00");
                }
                else {
                    System.out.println("7:00");
                }
            }
        }
    }
    public static void main(String[] args) {

        AlarmClock d1 = new AlarmClock();
        d1.day = 0;
        d1.x = true ;
        d1.vacation(d1.day, d1.x);


    }

}