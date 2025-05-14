package JavaGudia_Question;

public class Armstrong {

    public static void main(String[] args) {
        int n = 153;
        System.out.println(isArmstrong(n));

    }
        public static boolean isArmstrong(int n) {
            int original = n;

            int digits = String.valueOf(n).length();
            int sum =0;
            while(n>0){
                int ans = n%10;
                sum+=Math.pow(ans,digits);
                n = n/10;
            }
            return sum==original;
        }
    }


