package CodeForces;

public class ReverseInteger {
    public static void main(String[] args) {
        int num = 123;
        System.out.println(test(num));
    }
    public static int test(int num){
        int rev = 0;
        while (num!=0){   // 123!=0 condition true
            int digit = num%10;      //  123%10 = 3
            rev = rev*10+digit;      //0*10+3 => rev = 3
            num = num/10;             // left 123/10 => 12 again same proces

        }
        return rev;
    }
}

// integer reverse