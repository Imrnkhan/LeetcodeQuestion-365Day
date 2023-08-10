package Coding_Question;

public class FibnonakiNextLine {

        public static void main(String[] args) {
            int limit = 1000;
            int a = 0, b = 1;

            while (a <= limit) {
                int count = 0;
                while (count < b && a + count <= limit) {
                    System.out.print(a + count + " ");
                    count++;
                }
                System.out.println();

                int c = a + b;
                a = b;
                b = c;
            }
        }
    }

//
//public class FibonacciNumberPrinting {
//    public static void main(String[] args) {
//        int limit = 1000;
//        int a = 0, b = 1;
//
//        for (int i = 1; a <= limit; i++) {
//            printFibonacciLine(a, b - 1);
//            int c = a + b;
//            a = b;
//            b = c;
//        }
//    }
//
//    private static void printFibonacciLine(int start, int end) {
//        if (start <= end) {
//            System.out.print(start + " ");
//            printFibonacciLine(start + 1, end);
//        } else {
//            System.out.println();
//        }
//    }
//}


//
//    Write a program to print numbers from 1 to 1000 in multuple lines such that number of elememts in nth line is determined by nth fibonacci series number.
//
//
//
//        Fibonacci series: 1,1,2,3,5,8,13....
//
//
//
//        Output should be:
//
//        1
//
//        2
//
//        3 4
//
//        5 6 7
//
//        8 9 10 11 12
//        Note: Stop the the program when you  encounter 1000