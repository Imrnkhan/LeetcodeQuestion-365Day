package Abstraction2WayIntfAbs;

// Abstract class
abstract class Animalclass {
    abstract void makeSound(); // Abstract method
}

// Concrete classes
class Dogs extends Animalclass {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cats extends Animalclass {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class AbsWithAbstraction {
    public static void main(String[] args) {
        Animalclass dog = new Dogs();
        Animalclass cat = new Cats();

        dog.makeSound();
        cat.makeSound();
    }
}


//this achive abstraction with the abstrct same abstrct exp