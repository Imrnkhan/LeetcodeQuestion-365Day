package polyporphism;

public class Ployprishims {
    void funA(byte b){
        System.out.println("funA1 byte of method");
    }
    void funA(int i){
        System.out.println("funA2 int of method");
    }

    public static void main(String[] args) {
        Ployprishims ps = new Ployprishims();
//        byte bx = 20;
//        ps.funA(bx);    // it will give the priority to the nearest one
        ps.funA(20);
    }
}


//Defining more than one functionality with the same name in the same class is known as
//polymorphism.

//class Shape {
//    void draw() {
//        System.out.println("Drawing a shape");
//    }
//}

//class Circle extends Shape {
//    @Override
//    void draw() {
//        System.out.println("Drawing a circle");
//    }
//}
//
//class Rectangle extends Shape {
//    @Override
//    void draw() {
//        System.out.println("Drawing a rectangle");
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Shape shape1 = new Circle();
//        Shape shape2 = new Rectangle();
//
//        shape1.draw();  // Output: Drawing a circle
//        shape2.draw();  // Output: Drawing a rectangle
//    }
//}
