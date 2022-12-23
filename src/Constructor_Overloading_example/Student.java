package Constructor_Overloading_example;


public class Student {
    //instance variables of the class
    int id;
    String name;

       Student(){   // zero argument constructor
        System.out.println("this a default constructor");
    }

    Student(int i, String n){    //perameter constructor
        id = i;
        name = n;
    }

    public static void main(String[] args) {
//object creation
        Student s = new Student();
        System.out.println("\nDefault Constructor values: \n");
        System.out.println("Student Id : "+s.id + "\nStudent Name : "+s.name);
        System.out.println("==================================================");
        System.out.println("\nParameterized Constructor values: \n");
        Student student = new Student(10, "David");
        System.out.println("Student Id : "+student.id + "\nStudent Name : "+student.name);
    }
}



////??Other way same process

//public class TestA {
//    int id;
//    String name;
//
//    public TestA() {
//    }
//
//    public TestA(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//
//    public static void main(String[] args) {
//        Zap.TestA d = new Zap.TestA();
//        System.out.println(d.id + " " + d.name);
//        System.out.println("========================");
//        Zap.TestA f = new Zap.TestA(10,"kahn");
//        System.out.println(f.id+" "+f.name);
//    }
//}
//
