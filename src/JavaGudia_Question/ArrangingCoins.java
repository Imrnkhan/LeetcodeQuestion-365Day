package JavaGudia_Question;

public class ArrangingCoins {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(test(n));
    }
    public static int test(int n){
        int i =1;
        while (n>=i){
            n = n-i;
            i++;
        }
        return i-1;
    }
}




/*
441. Arranging Coins
Easy
3.3K
1.2K
Companies
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.



Example 1:


Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
Example 2:


 */