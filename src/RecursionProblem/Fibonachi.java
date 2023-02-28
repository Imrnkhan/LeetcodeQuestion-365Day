package RecursionProblem;

public class Fibonachi {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fib(n));
    }
    public static int Fib(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return Fib(n-1)+Fib(n-2);
    }
}








/*
public static int fibonacci(int n) {
    if (n == 0 || n == 1) {
        return n;
    } else {
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

 */