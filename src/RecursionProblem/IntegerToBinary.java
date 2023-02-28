package RecursionProblem;

public class IntegerToBinary {
    public static void main(String[] args) {
        int num = 15;
        System.out.println(test(num));
    }

    public static String test(int num) {
        if (num == 0) {
            return "0";
        } else if (num  == 1) {
            return "1";
        } else {
            int quotient = num / 2;
            int remainder = num % 2;
            return test(quotient) + remainder;
        }
    }
}



//Another way

/*
String binary = Integer.toBinaryString(decimal);
 */