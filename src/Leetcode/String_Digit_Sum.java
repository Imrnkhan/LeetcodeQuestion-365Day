package Leetcode;

public class String_Digit_Sum {
    public static void main(String[] args) {
        String str = "12345";       // you take "ehr3h4h4h";
        int sum = 0;
        System.out.println(test(str,sum));

    }
    public static int test(String str, int sum){
        for(int i =0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){

             sum= sum+Character.getNumericValue(str.charAt(i));



            }



        }

        return sum;
    }
}
