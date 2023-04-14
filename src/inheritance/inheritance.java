package inheritance;

 class inheritance {
    float  salary =500;

}
class employee extends inheritance{
     int amount = 850;

    public static void main(String[] args) {
        inheritance t = new inheritance(); //parent

        employee em = new employee(); //child class

        System.out.println(em.amount);
        System.out.println(em.salary);

//if you are using the parent class only access parent class not child
        System.out.println(t.salary);

}
    }




    /*
    public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark bark!");
    }
}

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic animal");
        animal.makeSound(); // prints "Some generic animal sound"

        Dog dog = new Dog("Fido");
        dog.makeSound(); // prints "Bark bark!"

        Cat cat = new Cat("Whiskers");
        cat.makeSound(); // prints "Meow!"
    }
}

     */