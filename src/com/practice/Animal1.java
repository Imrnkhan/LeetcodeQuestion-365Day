package com.practice;




public class Animal1 {
     void eat(){
         System.out.println("eating...");
     }

}
class dogs extends Animal1{
    void bark(){
        System.out.println("barking..");
    }
}
class babydog extends dogs {
    void beek(){
        System.out.println("beeping...");
    }
}
class maine{   //main class
    public static void main(String[] args) {
        babydog d = new babydog();
           d.beek();
        d.eat();
        d.beek();

    }
}