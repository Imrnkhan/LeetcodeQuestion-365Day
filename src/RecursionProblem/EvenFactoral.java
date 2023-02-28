package RecursionProblem;

public class EvenFactoral {
    public static void main(String[] args) {
        int n = 5;
        test(n);
    }
    public static void test(int n){
        int prod = 1;
        for(int i =2;i<=n;i+=2){
            prod*=i;
        }
        System.out.println(prod);
    }
}

/*
num = 5
even = 2,4
=> 2*4 = 8 ans
 */
