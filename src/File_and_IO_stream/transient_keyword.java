package File_and_IO_stream;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class transient_keyword implements Serializable {
    int id;
    String name;
    transient int age;//Now it will not be serialized
    public transient_keyword(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }
}
class Main{

    public static void main(String args[])throws Exception{
        transient_keyword s1 =new transient_keyword(211,"ravi",22);//creating object
//writing object into file
        FileOutputStream f=new FileOutputStream("f.txt");
        ObjectOutputStream out=new ObjectOutputStream(f);
        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("success");
    }
}


/*
Real time example another way
import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;
    transient private String password;  // 'transient' means this field will not be serialized

    public Person(String name, int age, String password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Password: " + password;
    }
}

public class TestTransient {
    public static void main(String[] args) {
        Person person = new Person("John", 25, "secretPassword");

        try {
            // Serialize the object
            FileOutputStream fileOut = new FileOutputStream("person.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(person);
            out.close();
            fileOut.close();
            System.out.println("Object serialized");

            // Deserialize the object
            FileInputStream fileIn = new FileInputStream("person.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Person deserializedPerson = (Person) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized Object: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
// final output
Object serialized
Deserialized Object: Name: John, Age: 25, Password: null

 */