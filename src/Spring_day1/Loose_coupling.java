package Spring_day1;

//public class Loose_coupling {
    //Vehicle.java
    interface Vehicle {
        public void go();
    }
    //dependency class
    class Car implements Vehicle{
        public void start() {
            System.out.println("Car started...");
        }
        @Override
        public void go() {
            start();
        }
    }
    class Bike implements Vehicle{
        public void ride() {
            System.out.println("ride started....");
        }
        @Override
        public void go() {
            ride();
        }
    }
    //dependent on the car class
    class Travel {
        //it is the dependency
        Vehicle v; //here we can store one of its implemented class obj.
        //constructor injection point
/*public Travel(Vehicle v) {
this.v=v;
} */
//setter injection point
        public void setV(Vehicle v) {
            this.v=v;
        }
        public void journey() {

            v.go();
            System.out.println("Jounrney started...");
        }
    }
    class Demo {
        public static void main(String[] args) {
//Travel tr=new Travel(new Car()); //injecting the dependency obj to the dependent, by calling constrcutor injection.
            Travel tr=new Travel();
            tr.setV(new Car()); // injecting the dependency obj to the dependent, by calling setter method.
            tr.journey();
            

        }
    }
//}
