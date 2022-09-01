package com.practice;


//Single level Inheritance

public class Animal {
    void eat(){
        System.out.println("eating...");
    }
}
class dog extends Animal{
    void bark(){
        System.out.println("barking....");
    }
}

class mains {   // main class
    public static void main(String[] args) {
        dogs d = new dogs();
        d.bark();
        d.eat();

    }
}
