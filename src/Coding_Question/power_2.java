package Coding_Question;

public class power_2 {
    public static void main(String[] args) {
        int num = 16;
        System.out.println(isPowerOfTwo(num));
    }
    public static boolean isPowerOfTwo(int num) {
        if(num == 0)
            return false;
        while(num % 2 == 0){
            num = num / 2;
        }
        if (num == 1) return true;
        return false;

    };

}

