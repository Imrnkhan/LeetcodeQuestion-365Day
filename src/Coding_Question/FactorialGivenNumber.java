package Coding_Question;

public class FactorialGivenNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(factorial(num));
    }
    public static int factorial(int num){
        int ans = 1;
        for(int i =1;i<=num;i++){
            ans = ans*i;
        }
        return ans;
    }
}

// this factorial find out only single number
