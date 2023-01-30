package Leetcode;

public class MissingNumberAnother_Way {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 4, 8, 7, 1};
        System.out.println(test(arr));
    }

    public static int test(int[] arr) {
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        int Sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Sum += arr[i];
        }
      return total - Sum;

    }
}
//
//total 8*(9)= 72%2= 36
//sum = 30
//total-sum = 36-30 = 6 ans
