package com.First;

public class student {
    public static void main(String[] args) {
        /*
         * 1=Monday
         * 2= Tuesday
         * 3= Wednesday
         * 4=Thursday
         * 5=Friday
         * 6=Saturday
         * 7=Sunday
         */


        int dayOfTheWeek =6;
        boolean holiday =true;
        if(dayOfTheWeek>1 && dayOfTheWeek<=5 || holiday) {
            System.out.println("wake up at 7:00");
        }
        else if(dayOfTheWeek==6 || dayOfTheWeek==7 || holiday) {
            System.out.println("sleep in");
        }

    }
}
