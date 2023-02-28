package RecursionProblem;

public class PowerOf2 {
    public static void main(String[] args) {

    int n = 5;
        System.out.println(test(n));
    }
    public static boolean test(int n){
        if(n==0)
            return false;
            while (n%2==0){
                n =n/2;
            }
            if(n==1){
                return true;
            }

        return false;
    }
}
