package CodeForces;

public class AgeCalculator {
    public static void main(String[] args) {
        int N = 400;
        test(N);
    }
    public static void test(int N){
        int years = N / 365;     // get year
        int months = (N % 365) / 30;   // get month
        int days = (N % 365) % 30;         // get days
        System.out.println(years+" "+"year");
        System.out.println(months+" "+"months");
        System.out.println(days+" "+"days");
    }

}
