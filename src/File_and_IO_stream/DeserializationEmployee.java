package File_and_IO_stream;

import java.io.*;

public class DeserializationEmployee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int id;
    private double salary;

    public DeserializationEmployee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', id=" + id + ", salary=" + salary + '}';
    }
}

class Demo{
    public static void main(String[] args) {
        DeserializationEmployee emp = null;

        try (FileInputStream fileIn = new FileInputStream("employees.ser");
             ObjectInputStream hs = new ObjectInputStream(fileIn)) {

            emp = (DeserializationEmployee) hs.readObject();
            System.out.println("Deserialized Employee...");
            System.out.println("Name: " + emp.getName());
            System.out.println("ID: " + emp.getId());
            System.out.println("Salary: " + emp.getSalary());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
