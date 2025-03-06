package File_and_IO_stream;

import java.io.*;

public class SerializationEmployee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int id;
    private double salary;

    public SerializationEmployee(String name, int id, double salary) {
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

class main {
    public static void main(String[] args) throws IOException {
        SerializationEmployee emp = new SerializationEmployee("John Doe", 101, 50000.0);

        try (FileOutputStream fileOut = new FileOutputStream("employee.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(emp);
            System.out.println("Serialized data is saved in employee.ser");

        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}

/*
import java.io.*;

class Person implements Serializable {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class SerializationExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("John", 30);

        // Serialize the object
        FileOutputStream fileOut = new FileOutputStream("person.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(person);
        out.close();
        fileOut.close();

        // Deserialize the object
        FileInputStream fileIn = new FileInputStream("person.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        Person deserializedPerson = (Person) in.readObject();
        in.close();
        fileIn.close();

        System.out.println("Deserialized Person: " + deserializedPerson.name + ", " + deserializedPerson.age);
    }
}

 */