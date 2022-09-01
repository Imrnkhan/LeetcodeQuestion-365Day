package com.First;

public class Score {
    public static void score(int one, int two, int three, int four, int six){
        int total = one+two+three+four*4+six*6;
        System.out.print("the total score  " +  total);

    }
    public static void main(String[] args){
        score(4,4,4,78,5);
    }
}
