package com.practice;


//Intr.java
interface Inter
{
    //abstract method
    void method1();
    //default method
    default void method2()
    {
        System.out.println("inside method2");
    }
    //static method
    static void method3()
    {
        System.out.println("inside method3");
    }
}
//IntrImpl1.java
class IntrImpl1 implements Inter{
    public void method1(){
        System.out.println("inside method1 of IntrImpl1");
    }
}
//Main.java
class Mainx{
    public static void main(String[] args){
        IntrImpl1 i1 = new IntrImpl1();
        i1.method1();
        i1.method2();
        Inter.method3();
    }
}