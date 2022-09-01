package collection_framework_Day11;

//
//Let’s create an application, where user will be prompted to enter the Student details
//        (roll, name, marks) till the user opted out. once he will opted out, then display all the student details back.

import java.util.ArrayList;
import java.util.Scanner;
public class Student {
    private int roll;
    private String name;
    private int marks;
    public Student() {
    }
    public Student(int roll, String name, int marks) {
        this.roll = roll;
        this.name = name;
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
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
}
class Mains {
    public static void main(String args[]) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while (true){
            System.out.println("Enter the details of Student "+(count++));
            System.out.println("Enter Roll");

            int roll= sc.nextInt();
            System.out.println("Enter Name :");
            String name= sc.next();
            System.out.println("Enter marks");
            int marks= sc.nextInt();
            Student student = new Student(roll,name,marks);
            students.add(student);
            System.out.println("Want More (y/n) ?");
            String choice = sc.next();
            if(choice.equalsIgnoreCase("n"))
                break;
        }
        System.out.println("Printing Details of all Students");
        System.out.println("=================================");
        for(Student student: students){
            System.out.println("Roll is :"+student.getRoll());
            System.out.println("Name is :"+student.getName());
            System.out.println("Marks is :"+student.getMarks());
            System.out.println("-----------------------------");
        }
    }
}
