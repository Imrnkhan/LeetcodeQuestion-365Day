package Coding_Question;

public class OverloadMainMethod {


        // Overloaded main() method which accepts Integer array as an argument.
        public static void main(Integer args[]) {
            System.out.println("Overloaded main() method called");
            System.out.println("Accepts Integer array as an argument.");
        }

        // Overloaded main method which accepts double value as an argument.
        public static void main(double args) {
            System.out.println("Overloaded main() method called");
            System.out.println("Accepts double value as an argument.");
        }

        // Original main() method which accepts String array as an argument.
        public static void main(String args[]) {
            System.out.println("Original main() method called");
            System.out.println("Accepts String array as an argument.");
        }
    }


