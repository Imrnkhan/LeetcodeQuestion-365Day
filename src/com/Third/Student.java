package com.Third;

public class Student {


    void StudentDetails(int roll, String name, int marks)
    {

        System.out.println("Roll no: "+roll);
        System.out.println("Name ..: "+name);
        System.out.println("Marks ..: "+marks);

    }

    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("===frist=====");
        s1.StudentDetails(27,"imran khan",292);



        Student s2 = new Student();

        System.out.println("====second=====");
        s2.StudentDetails(24, "samir khan", 349);


        s1 = null;

        s1.StudentDetails(0, null, 0);

        s2=null;

        s2.StudentDetails(0, null, 0);




    }

}