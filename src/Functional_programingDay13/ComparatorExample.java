package Functional_programingDay13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Student class (without Comparable)
class Employee {

    private int rollNo;
    private String name;


    public Employee(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{rollNo=" + rollNo + ", name='" + name + "'}";
    }
}

// Comparator to sort students by name
class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee s1, Employee s2) {
        return s1.getName().compareTo(s2.getName()); // Sort by name
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> students = new ArrayList<>();
        students.add(new Employee(103, "Alice"));
        students.add(new Employee(101, "Bob"));
        students.add(new Employee(102, "Charlie"));

        // Sort students using custom ordering (name)
        Collections.sort(students, new NameComparator());

        // Sort by custom ordering (name)
        Collections.sort(students, new NameComparator());


        //sorted by name used

//        System.out.println("\nSorted by name:");
//        for (Employee employee : students) {
//            System.out.println(employee);

        // Print sorted students
        for (Employee student : students) {
            System.out.println(student);
        }
    }
}