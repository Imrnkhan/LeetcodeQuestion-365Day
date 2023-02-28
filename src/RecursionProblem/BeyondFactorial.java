package RecursionProblem;

public class BeyondFactorial {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(test(n));
    }
    public static double test(int n){
        if(n==1){
            return 0;
        }
        return test(n-1)+Math.log(n);
    }
}
/*
this is return thr factorial return value in double
 */