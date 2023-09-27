package polyporphism;

    //Creating a parent class. override
    public class OverridingDynamic{
        //defining a method
        void run(){
            System.out.println("Vehicle is running");
        }
    }
    //Creating a child class
    class Bike extends OverridingDynamic{
        //defining the same method as in the parent class
        void run(){
            System.out.println("Bike is running safely");
        }

        public static void main(String args[]){
            Bike obj = new Bike();//creating object

            obj.run();//calling method

        }
    }

//same method name and same perameter