package Coding_Question;

public class FibonacciSeries {

        public static void main(String[] args) {
            int n = 15; // Number of elements in the Fibonacci series

            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
        }

        public static int fibonacci(int n) {
            if (n == 0) {
                return 0;
            }
            if(n==1){
                return 1;
            }
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }




//
//
//public class FibonacciSeries {
//    public static void main(String[] args) {
//        int n = 15; // Number of elements in the Fibonacci series
//        int first = 0, second = 1;
//
//        System.out.println("Fibonacci Series up to " + n + " terms:");
//        System.out.print(first + " " + second + " ");
//
//        for (int i = 2; i < n; i++) {
//            int next = first + second;
//            System.out.print(next + " ");
//            first = second;
//            second = next;
//        }
//    }
//}
