package com.Fourth;

public class Demo {
    Demo()
    {  this(47);
        System.out.println("Inside the Demo()");
    }
    Demo(String s)
    {
        System.out.println("Inside the Demo(String s)");
    }
    Demo(int i)
    {
        this("Java is powerful language");

        System.out.println("Inside the Demo(int i)");
    }
    Demo(float f)
    {
        this();
        System.out.println("Inside the Demo(float f)");
    }


    public static void main(String[] args) {


        Demo d1 = new Demo(47.34f);


    }

}

//https://www.notion.so/Day-1st-70a7c5e03c4a45a5bc30c524470b08db