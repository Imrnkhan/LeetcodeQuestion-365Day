package ArrayList_Problem;

import java.util.Objects;

class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overriding equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the current object and 'obj' are the same reference
        if (obj == null || getClass() != obj.getClass()) return false;   // if obj is null -> false

        Person person = (Person) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    // Overriding hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(name, age); // Generates a unique hash based on fields
    }
}

public class EqualsHashCodeExample {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);

        // Checking equality
        System.out.println(p1.equals(p2)); // ✅ true (same attributes)
        System.out.println(p1.equals(p3)); // ❌ false (different attributes)

        // Checking hash codes
        System.out.println("HashCode p1: " + p1.hashCode());
        System.out.println("HashCode p2: " + p2.hashCode());
        System.out.println("HashCode p3: " + p3.hashCode());
    }
}
