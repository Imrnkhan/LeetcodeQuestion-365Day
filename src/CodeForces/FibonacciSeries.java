package CodeForces;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 15; // Number of Fibonacci numbers to generate
        int firstNumber = 0;
        int secondNumber = 1;

        System.out.print(firstNumber + " " + secondNumber + " "); // Print the first two numbers

        for (int i = 3; i <= n; i++) {
            int nextNumber = firstNumber + secondNumber;
            System.out.print(nextNumber + " ");
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }
    }
}



/// this fib series in line way

//another way 

/*
public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 15; // Number of Fibonacci numbers to generate

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

0 1 1 2 3 5 8 13 21 show on

 */