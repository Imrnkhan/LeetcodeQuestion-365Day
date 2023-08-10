package GeekForGeek;

public class CountDigit {
    public static void main(String[] args) {
        int num = 12;
        System.out.println(test(num));
    }
    public static int test(int num){
        int count =0;
        String numStr = Integer.toString(num);
        for(int i =0;i<numStr.length();i++){
            int digit = Character.getNumericValue(numStr.charAt(i));
            if(digit!=0 && num%digit==0){
                count++;
            }
        }
        return count;
    }
}

// Character.getNumericValue  yeh work krta hi ki ham ko string mai se only digit get krta hi
//or ex= "12" than use krta hi phale 1 and phir 2 one by one deta hi


//another way

//    static int evenlyDivides(int N){
//        int count = 0;
//        int num = N;
//
//        while (num > 0) {
//            int digit = num % 10;
//            if (digit != 0 && N % digit == 0) {
//                count++;
//            }
//            num=  num / 10;
//        }
//
//        return count;
//    }







/*
Given a number N. Count the number of digits in N which evenly divides N.

Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.


Example 1:

Input:
N = 12
Output:
2
Explanation:
1, 2 both divide 12 evenly
Example 2:

Input:
N = 23
Output
0
Explanation:
2 and 3, none of them
divide 23 evenly
 */