package com.Fourth;

public class Student {
    private int roll;
    private String name;
    private int age;
    private int marks;


    Student()
    {


    }

    public Student(int roll, String name, int age, int marks) {
        super();
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

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
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    //18<age<60, 0<marks<500).
    public void showDetails(){

        if((age>18&&age<60)&&(marks>0&&marks<500))
        {
            System.out.println("Roll is :"+roll);
            System.out.println("Name is :"+name);
            System.out.println("Age is :"+age);
            System.out.println("Marks is :"+marks);
        }
        else
        {
            System.out.println("Sorry,age and marks have not matched requirement");
        }


    }


    public static void main(String[] args) {

        //using zero argument constructor

        Student student1 = new Student();
        student1.setRoll(100);
        student1.setName("Kabeer sing");
        student1.setAge(12);
        student1.setMarks(800);


        //using parameterized constructor

        Student student2 = new Student(342,"Imran",20,240);
        System.out.println("Student1 details: ");
        student1.showDetails();
        student2.showDetails();




    }

}
