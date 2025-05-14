package Zap;

import java.util.Arrays;
import java.util.Stack;

public class nextSmallerElement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3};
        System.out.println(Arrays.toString(test(arr)));
    }
    public static int[] test(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            // Remove all elements not smaller
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            // Assign result using if-else (clearer than ternary)
            if (stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }

            // Push current element to stack
            stack.push(arr[i]);
        }

        return res;
    }

}
