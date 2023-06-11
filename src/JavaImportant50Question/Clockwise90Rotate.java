package JavaImportant50Question;

public class Clockwise90Rotate {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotateBy90(arr);
    }
    public static void rotateBy90(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            StringBuilder str = new StringBuilder();
            for (int j = arr.length - 1; j >= 0; j--) {
                str.append(arr[j][i]).append(" ");
            }
            System.out.println(str);
        }
    }
}


//this is rotate in 90 clockwise