package GeekForGeek;


public class FactorialDigitCount {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(test(num));
    }

    public static int test(int num) {
        int sum = 1;
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        int count = 0;
        while (sum > 0) {
            sum = sum / 10;
            count++;
        }
        return count; // Return the count of digits in the factorial
    }
}


//exp 5  ka factorial 120 and digit cooount = 3
//    //