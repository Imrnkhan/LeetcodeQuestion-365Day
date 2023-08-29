package StaticMethodExp;

interface Vehicle {
    void start();

     default void stop() {
        System.out.println("Vehicle stopping...");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car starting...");
    }


}

public class DefaultMethod {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop(); // Using the default implementation from the interface
    }
}

//ager ham default method ko manul create krte or override krte hi to weh
//dono jegh same return krega default method mai bhi or jo override kiya hi weha bhi