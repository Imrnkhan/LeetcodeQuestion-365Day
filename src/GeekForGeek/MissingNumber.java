package GeekForGeek;

public class MissingNumber {
    public static void main(String[] args) {
        int []arr = {2, 5, 3, 1};
        int N = 5;
        System.out.println(test(arr,N));
    }
    public static int test(int[] arr,int N){
        // Arrays.sort(arr);

        int totalSum = (N * (N + 1)) / 2; // Sum of 1 to N formula
        int arraySum = 0;

        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }

        return totalSum - arraySum;
    }
}
