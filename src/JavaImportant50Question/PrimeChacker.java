package JavaImportant50Question;

public class PrimeChacker {
    public static void main(String[] args) {
        int n =5;

        for(int i =1;i<=n;i++){
            if(test(i)){
                System.out.print(i+" ");
            }
        }
        }

    public static boolean test(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
