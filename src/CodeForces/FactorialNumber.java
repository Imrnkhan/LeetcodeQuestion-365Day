package CodeForces;

public class FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(test(num));
    }
    public static int test(int num){
        int ans = 1;
        for(int i =1;i<num;i++){
            ans*=i;
        }
        return ans;
    }
}
