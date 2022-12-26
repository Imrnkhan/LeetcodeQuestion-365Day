package Coding_Question;

import java.math.BigInteger;

public class Add_String {
    public static void main(String[] args) {
        String num1 = "11", num2 = "123";
        System.out.println(addsring(num1,num2));

    }
    public static String addsring(String num1, String num2){
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);

        BigInteger ans = n1.add(n2);

        return String.valueOf(ans);
    }
}



// 11+123 = 134 ans