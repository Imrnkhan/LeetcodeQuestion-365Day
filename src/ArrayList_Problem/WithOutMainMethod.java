package ArrayList_Problem;

public class WithOutMainMethod {

        static
        {
            System.out.println("Hello World!");
            System.exit(0); // prevents “main method not found” error
        }
    }



// This program successfully runs prior to JDK 7
//public class Test
//{
//    // static block
//    static
//    {
//        System.out.println("Hello User");
//    }
//}


/*
Prior to Java 7, yes, we could run Java program without main() method. But, from JDK7 main method is mandatory.
The compiler will verify first, whether main() is present or not. If your Java program doesn't contain the main method,
 then you will get an error main method not found in the class .
 */