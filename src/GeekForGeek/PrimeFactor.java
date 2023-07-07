package GeekForGeek;
import java.util.ArrayList;
import java.util.List;

public class PrimeFactor {
    public static void main(String[] args) {
        int num = 100;

        int[] primeFactors = AllPrimeFactors(num);

        for (int i = 0; i < primeFactors.length; i++) {
            System.out.print(primeFactors[i] + " ");
        }
    }

    public static int[] AllPrimeFactors(int N) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                while (N % i == 0)
                    N /= i;
                ans.add(i);
            }
        }

        if (N > 1)
            ans.add(N);

        // Convert the list to an array
        int[] primeFactors = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            primeFactors[i] = ans.get(i);
        }

        return primeFactors;
    }
}
