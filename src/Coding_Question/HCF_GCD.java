package Coding_Question;

public class HCF_GCD {
    public static void main(String[] args) {
        int num1 = 45;
        int num2 = 10;
        System.out.println(findHCF(num1,num2));
    }

    public static int findHCF(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}

