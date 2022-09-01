package Functional_programingDay13;

public class Student {
private int roll;
private String name;
private int mark;

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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }

    public Student(int roll, String name, int mark) {
        this.roll = roll;
        this.name = name;
        this.mark = mark;


    }
    interface demo{
        void details(Student student);
    }

    public static void main(String[] args) {
        demo ds = (s)-> {
            System.out.println("student roll no is: " + s.getRoll());
            System.out.println("student name is : " + s.getName());
            System.out.println("student marks is :"+s.getMark());

        };
        ds.details(new Student(10,"Ram",850));



    }
}

