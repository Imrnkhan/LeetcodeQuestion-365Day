package JavaGudia_Question;

public class  PrimeCheckNumber {
    public static void main(String[] args) {
        int num = 19;
        System.out.println(test(num));
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




