package Abstraction2WayIntfAbs;

    interface AbstractionWithIntrface {
        void makeSound();
    }

    class Dog implements AbstractionWithIntrface {
        @Override
        public void makeSound() {
            System.out.println("Dog barks");
        }
    }

    class Cat implements AbstractionWithIntrface {
        @Override
        public void makeSound() {
            System.out.println("Cat meows");
        }
    }

    public class AbsWithIntr {
        public static void main(String[] args) {
            AbstractionWithIntrface dog = new Dog();
            AbstractionWithIntrface cat = new Cat();

            dog.makeSound();
            cat.makeSound();
        }
    }


//this is achive abstraction in Interface same interface exp