package RecursionProblem;

public class CoinChangeDP {
    public static void main(String[] args) {
        int[] arr = {2,5,3,6};
        int sum = 10;
        System.out.println(test(arr,sum));
    }
    public static long test(int[] arr,int sum){
        long[] dp = new long[sum + 1];
        dp[0] = 1;

        for (int coin : arr) {
            for (int i = coin; i <= sum; i++) {
                dp[i] += dp[i - coin];
            }
        }

        return dp[sum];
    }
}


/*
Given an integer array coins[ ] of size N representing different denominations of currency and an integer sum, find the number of ways you can make sum by using different combinations from coins[ ].
Note: Assume that you have an infinite supply of each type of coin. And you can use any coin as many times as you want.

Example 1:

Input:
N = 3, sum = 4
coins = {1,2,3}
Output: 4
Explanation: Four Possible ways are: {1,1,1,1},{1,1,2},{2,2},{1,3}.
Example 2:

Input:
N = 4, Sum = 10
coins = {2,5,3,6}
Output: 5
Explanation: Five Possible ways are: {2,2,2,2,2}, {2,2,3,3}, {2,2,6}, {2,3,5} and {5,5}.
 */