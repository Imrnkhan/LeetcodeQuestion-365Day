package Coding_Question;

public class power_3 {
    public static void main(String[] args) {
        int num = 27;
        System.out.println(isPowerOfThree(num));

    }
    public static boolean isPowerOfThree(int num) {

        if(num == 0)
            return false;
        while(num % 3 == 0){
            num = num / 3;
        }
        if (num == 1) return true;
        return false;

    }
}
