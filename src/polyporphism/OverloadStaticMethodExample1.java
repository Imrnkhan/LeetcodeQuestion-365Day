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


// Class 1
// Helper class
//class Helper {
//
//    // Method with 2 integer parameters
//    static int Multiply(int a, int b)
//    {
//        // Returns product of integer numbers
//        return a * b;
//    }
//
//    // Method 2
//    // With same name but with 2 double parameters
//    static double Multiply(double a, double b)
//    {
//        // Returns product of double numbers
//        return a * b;
//    }
//}
//
//// Class 2
//// Main class
//class GFG {
//    // Main driver method
//    public static void main(String[] args)
//    {
//        // Calling method by passing
//        // input as in arguments
//        System.out.println(Helper.Multiply(2, 4));
//        System.out.println(Helper.Multiply(5.5, 6.3));
//    }
//}