package Coding_Question;

public class Question {
    public static void main(String[] args) {
        int n = 26;
        test(n);
    }
    public static void test(int n){
        int count = 0;
        count = (int) Math.floor(n/5);
        if(n%5==0){
            System.out.println(count);
        }
        else{
            System.out.println(count+1);
        }
    }
}
