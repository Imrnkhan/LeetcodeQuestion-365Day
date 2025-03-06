package Functional_programingDay13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Student class implementing Comparable
class Students implements Comparable<Students> {

    private int rollNo;
    private String name;

    public Students(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    // Override compareTo method to define natural ordering
    @Override
    public int compareTo(Students other) {
        return this.rollNo - other.rollNo; // Sort by roll number
    }

    @Override
    public String toString() {
        return "Student{rollNo=" + rollNo + ", name='" + name + "'}";
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(103, "Alice"));
        students.add(new Students(101, "Bob"));
        students.add(new Students(102, "Charlie"));

        // Sort students using natural ordering (rollNo)
        Collections.sort(students);

        // Print sorted students
        for (Students student : students) {
            System.out.println(student);
        }
    }
}