package polyporphism;

public class OverloadStaticMethodExample1 {

    //static method
    public static void display() {


        System.out.println("Static method called.");
    }

    //overloaded static method
    public static void display(int x) {
        System.out.println("An overloaded static method called.");

    }
    //main method
    public static void main(String args[]) {

//calling static method by using the class name
        OverloadStaticMethodExample1.display();
        OverloadStaticMethodExample1.display(160);



        // class new varible = new obj class name pass argument value
    }
}

//method name same but perameter are diff
//and when static methood call by 3 way
// direct way and create obj