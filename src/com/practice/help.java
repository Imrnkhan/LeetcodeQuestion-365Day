package com.practice;

public class help {
        int x = 50;
    public static void main(String[] args) {
        help hs = new help();
       hs.x = 60;
        System.out.println(hs.x);
help hd = hs;
        System.out.println(hd.x);
    }
}
