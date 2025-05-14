package ArrayList_Problem;

import java.util.HashSet;
import java.util.Objects;

class Person {
    private String name;
    private int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Overriding equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if the current object and 'obj' are the same reference
        if (obj == null || getClass() != obj.getClass()) return false;   // if obj is null -> false || check class

        Person person = (Person) obj;       //Typecast obj to Person
        return id == person.id && name.equals(person.name);    // compare both

    }

    // Overriding hashCode()
    @Override
    public int hashCode() {
        return id+name.hashCode();// Generates a unique hash based on fields
    }
}

public class EqualsHashCodeExample {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Alice", 25);
        Person p3 = new Person("Bob", 30);
        Person p4 = new Person("Bob", 30);

        // Checking equality
        System.out.println(p1.equals(p2)); // ✅ true (same attributes)
        System.out.println(p1.equals(p3)); // ❌ false (different attributes)
        System.out.println(p3.equals(p4)); // true



        // Checking hash codes
        System.out.println("HashCode p1: " + p1.hashCode());
        System.out.println("HashCode p2: " + p2.hashCode());
        System.out.println("HashCode p3: " + p3.hashCode());
    }
}
/*
    Understanding equals() and hashCode()
      1.  ✅ equals()
        - Used to compare the contents of objects to check if they are equal.
        - Defined in Object class and must be overridden for meaningful object comparison.
     2.   ✅ hashCode()
        - Returns an integer hash code that represents an object.
        - If two objects are equal according to equals(), they must have the same hashCode().
        - Used in hashing-based collections (e.g., HashMap, HashSet) for efficient storage and retrieval.


 */