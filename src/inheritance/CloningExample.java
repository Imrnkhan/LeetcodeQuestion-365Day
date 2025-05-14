package inheritance;

class Person implements Cloneable {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding clone() method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Calls Object's clone method
    }

    // Display method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class CloningExample {
    public static void main(String[] args) {
        try {
            Person person1 = new Person("Imran", 25);
            Person person2 = (Person) person1.clone(); // Cloning person1

            // Displaying original and cloned objects
            System.out.println("Original Object:");
            person1.display();

            System.out.println("Cloned Object:");
            person2.display();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
        }
    }
}