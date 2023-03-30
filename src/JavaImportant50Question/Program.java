package JavaImportant50Question;

public class Program {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(test(arr));

    }
    public static int test(int[] arr){
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}
