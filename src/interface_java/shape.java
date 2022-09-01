package interface_java;

public interface shape {
    void draw();
}
class rectangle implements shape{

    @Override
    public void draw() {
        System.out.println("drwaing ractangle....");

    }
}
class circle implements shape{

    @Override
    public void draw() {
        System.out.println("drawing circle....");

    }
}
class main{


    public static void main(String[] args) {
        System.out.println("main method....");

shape s = new circle(); // run circle class
s.draw();



shape b = new rectangle();   //run the rectangle class
b.draw();
    }
}






//    What is the difference between an interface and an abstract class?
//        Abstract classes can contain code or data. Interface do not contain code or data.
//        A class can inherit from only one abstract class but can implement an unlimited number of interfaces