package StaticMethodExp;




interface StaticMthodExample {
    static int add(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        int sum = StaticMthodExample.add(5, 3); // Calling static method using interface name
        int difference = StaticMthodExample.subtract(10, 4);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
    }
}

// static method ko ham override nhi kr sak te hi