package com.Fourth;

public class Student2 {
    private int roll;
    private String name;
    private String address;
    private String collageName;


    public Student2(int roll, String name, String address, String collageName) {
        super();
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.collageName = collageName;
    }

    public Student2(int roll, String name, String address) {
        super();
        this.roll = roll;
        this.name = name;
        this.address = address;
        this.collageName = "NIT";
    }
    //GETTER AND SETTER
    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }


    public static Student2 getStudent(boolean isFromNIT)
    {

        if(isFromNIT)
        {

            Student2 s = new Student2(23,"imran","Gurgaon");

            return s;

        }
        else
        {
            Student2 s1 = new Student2(34,"sameer","Delhi","DU");
            return s1;
        }



    }


    public static void main(String[] args) {

        Student2 s2 = getStudent(true);
        Student2 s3 = getStudent(false);


        System.out.println("===========Student Details==================");

        System.out.println("----------------------------------------------");
        System.out.println("Student one Details");
        System.out.println("----------------------------------------------");
        System.out.println("Student Name : "+s2.getName());
        System.out.println("Student Roll No : "+s2.getRoll());
        System.out.println("Student Address : "+s2.getAddress());
        System.out.println("Student Collage Name : "+s2.getCollageName());
        System.out.println("----------------------------------------------");
        System.out.println("Student two Details");
        System.out.println("----------------------------------------------");
        System.out.println("Student Name : "+s3.getName());
        System.out.println("Student Roll No : "+s3.getRoll());
        System.out.println("Student Address : "+s3.getAddress());
        System.out.println("Student Collage Name : "+s3.getCollageName());


    }


}
