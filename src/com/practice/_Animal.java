package com.practice;

/*Super Keyborad in java
super keywoard is main work is print parent class
*/


class _Animal {

    String color = "white";
}

class Dog extends _Animal {
    String color = "black";

    void printColor() {
        System.out.println(color);//prints color of Dog class
        System.out.println(super.color);//prints color of Animal class
    }
}

class Maind {     //main class
    public static void main(String args[]) {
        Dog d = new Dog();
        d.printColor();
    }
}

