package RecursionProblem;

public class ImplementGCDProblem {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        System.out.println(test(a,b));
    }
    public static int test(int a,int b){
        if(b==0)
            return a;
    return test(b,a%b);
    }

}



/*
int gcd (int a, int b) {
   if (b == 0)
       return a;
   return gcd(b, a % b);
}

Basic Euclidean Algorithm for GCD
 */