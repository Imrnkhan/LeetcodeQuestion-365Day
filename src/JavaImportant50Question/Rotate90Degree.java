package JavaImportant50Question;

public class Rotate90Degree {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        test(arr);
    }
    public static void test(int[][] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            String row = "";
            for (int j = 0; j < arr.length; j++) {
                row += arr[j][i] + " ";
            }
            System.out.println(row);
        }
    }


}

