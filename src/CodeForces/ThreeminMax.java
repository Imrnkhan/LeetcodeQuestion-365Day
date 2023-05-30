package CodeForces;

public class ThreeminMax {
    public static void main(String[] args) {
        int A =1;
        int B = 2;
        int C = 3;
        int min = Math.min(Math.min(A, B), C);
        int max = Math.max(Math.max(A, B), C);

        System.out.println(min + " " + max);

    }
}
