package RecursionProblem;

public class OddFactorial {
    public static void main(String[] args) {
        int num = 5;
        test(num);
    }
    public static void test(int num){
        int purd = 1;
        for(int i =1;i<=num;i+=2){
            purd*=i;
        }
        System.out.println(purd);
    }
}


/*
num =5
odd num = 1 to 5=> 1,3,5
 num = 5 => 1*3*5 = 15 ans
 */