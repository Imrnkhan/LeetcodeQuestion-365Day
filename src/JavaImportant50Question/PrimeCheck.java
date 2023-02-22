package JavaImportant50Question;

public class PrimeCheck {
    public static void main(String[] args) {
        int n =19;
        System.out.println(test(n));
    }
    public static boolean test(int n){
        if(n==0|| n==1){
            return false;
        }
        for(int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
