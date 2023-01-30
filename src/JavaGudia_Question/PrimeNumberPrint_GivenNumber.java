package JavaGudia_Question;

public class PrimeNumberPrint_GivenNumber {
    public static void main(String[] args) {
        int num = 100;

        for(int i =1;i<=num;i++){
            if(test(i)){
                System.out.println("prime Number: "+ i);
            }
        }
    }
    public  static boolean test(int num){
        if(num==0 || num==1){
            return false;
        }
        for(int i =2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
