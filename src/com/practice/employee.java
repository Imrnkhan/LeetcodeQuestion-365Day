package com.practice;

public class employee {

    String empid = "EP-011";
    String name = "Aman";
    int salary = 7500;
    String address = "delhi";

    public void Display(){
        System.out.println("=============================");
        System.out.println("empid "+empid);
        System.out.println("Emp name"+name);
        System.out.println("emp salary"+salary);
        System.out.println("emp addres"+address);

    }
    public static void main(String[] args) {
        employee demo = new employee();
        demo.Display();
}

}
