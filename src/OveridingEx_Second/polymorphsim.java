package OveridingEx_Second;


//this method overring method
//public class polymorphsim {
    class Animal {
        public void animalSound() {
            System.out.println("The animal makes a sound");
        }
    }



    class Dog extends Animal {
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

    class Main {
        public static void main(String[] args) {
            Animal myAnimal = new Animal();  // Create a Animal object
            Animal myDog = new Dog();  // Create a Dog object
            myAnimal.animalSound();
            myDog.animalSound();
        }
    }

