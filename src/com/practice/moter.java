package com.practice;


//Bike.java
abstract class moter {
    moter(){ //constructor
        System.out.println("bike is created");
    }

    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}
//Creating a Child class which inherits Abstract class
//Honda.java
class Honda extends moter {
    void run(){
        System.out.println("running safely..");
    }
}
//Creating a Main class which calls abstract and non-abstract methods
//Main.java
class demo{
    public static void main(String args[]){
        moter obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}