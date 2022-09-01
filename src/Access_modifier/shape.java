package Access_modifier;

//Lets create an abstract class Shape with an abstract method draw. and create 2
//        concreate child classes for this Shape class Rectangle and Circle and override the draw
//        method accordingly
//


 abstract class shape {
     abstract void draw();
}
class circle extends shape{

    @Override
    void draw() {
        System.out.println("shape class ");
    }
}
class rectangle extends shape{

    @Override
    void draw() {
        System.out.println("rctangle class");
    }
}
class main{
    public static void main(String[] args) {
        shape s1 = new circle();
        shape s2 = new rectangle();
        s1.draw();
        s2.draw();

        System.out.println("main method");
    }
}