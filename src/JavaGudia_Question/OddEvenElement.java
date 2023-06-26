package JavaGudia_Question;

public class OddEvenElement {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        printOddNumbers(arr);printEvenNumbers(arr);

    }
    public static void printOddNumbers(int[] arr) {
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void printEvenNumbers(int[] arr) {
        for (int i =0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
