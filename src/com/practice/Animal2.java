package com.practice;

//Hiericical Inheritance


public class Animal2 {
    void eat(){
        System.out.println("eating....");
    }
}
class doge extends Animal2{
    void bark(){
        System.out.println("barking..");
    }
}
class cat extends Animal2{
    void meoww(){
        System.out.println("meoww...");
    }
}
class mainh{   // main class
    public static void main(String[] args) {
        cat c = new cat();
        c.meoww();
        c.eat();
       // c.bark();  Compile Time error

    }
}

