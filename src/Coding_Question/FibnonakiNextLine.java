package Coding_Question;

public class FibnonakiNextLine {

        public static void main(String[] args) {
            int limit = 1000;
            int a = 0, b = 1;

            while (a <= limit) {
                int count = 0;
                while (count < b && a + count <= limit) {
                    System.out.print(a + count + " ");
                    count++;
                }
                System.out.println();

                int c = a + b;
                a = b;
                b = c;
            }
        }
    }


