package com.practice;

import java.util.ArrayList;

public class boxing {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
//        for(int x: al){  //
//            System.out.println(x);
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
}

