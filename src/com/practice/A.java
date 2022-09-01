package com.practice;

public class A {
    public A(){
        System.out.println("inside constuctor..");
    }
    {
        System.out.println("inside non-statci block");
    }
    static {
        System.out.println("inside static block");

    }
    static {
        System.out.println("inside....");
    }
    void funA(){
        System.out.println("inside funA of A");
    }

    public static void main(String[] args) {
        System.out.println("inside main..");
        A a1 = new A();
        a1.funA();


    }
}

