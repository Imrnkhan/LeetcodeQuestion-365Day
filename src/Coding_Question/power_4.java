package Coding_Question;

public class power_4 {
    public static void main(String[] args) {
        int num = 26;
        System.out.println(isPowerOfFour(num));
    }
    public static boolean isPowerOfFour(int num) {

        if(num == 0)
            return false;
        while(num % 4 == 0){
            num = num / 4;
        }
        if (num == 1) return true;
        return false;
    }
}



