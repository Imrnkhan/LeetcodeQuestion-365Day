package BinarySearchProblem;

import java.util.Arrays;

public class TwoSumLessK {
    public static void main(String[] args) {
        int[] arr ={34,23,1,24,75,33,54,8};
        int k =60;
        Arrays.sort(arr);
        System.out.println(test(arr,k));
    }

    public static int test(int[] A, int K) {
        Arrays.sort(A);
        int i = 0;
        int j = A.length - 1;
        int ans = -1;
        while (i < j) {
            if (A[i] + A[j] >= K) {
                j--;
            } else {
                ans = Math.max(ans, A[i] + A[j]);
                i++;
            }
        }
        return ans;
    }
}

//t.s = nlogn  ,O(1)


/*
Given an array A of integers and integer K, return the maximum S such that there exists i < j with A[i] + A[j] = S and S < K. If no i, j exist satisfying this equation, return -1.

Example 1:

Input: A = [34,23,1,24,75,33,54,8], K = 60
Output: 58
Explanation:
We can use 34 and 24 to sum 58 which is less than 60.
Example 2:

Input: A = [10,20,30], K = 15
Output: -1
Explanation:
In this case it's not possible to get a pair sum less that 15.

Note:

1 <= A.length <= 100
1 <= A[i] <= 1000
1 <= K <= 2000
 */