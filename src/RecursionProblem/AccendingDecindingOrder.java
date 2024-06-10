package RecursionProblem;

public class AccendingDecindingOrder {


        public static void main(String[] args) {
            int value = 5;
            printSequence(value);
        }

        // Recursive method to print the sequence
        public static void printSequence(int n) {
            if (n > 0) {
                System.out.print(n + " ");
                printSequence(n - 1);
                System.out.print(n + " ");
            }
        }
    }


/*

brute force wy
public class BruteForcePrint {

    public static void main(String[] args) {
        int value = 5;

        // Print descending part
        for (int i = value; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // Print ascending part
        for (int i = 1; i <= value; i++) {
            System.out.print(i + " ");
        }
    }
}

 */