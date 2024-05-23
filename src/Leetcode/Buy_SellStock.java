package Leetcode;

public class Buy_SellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(test(arr));
    }
    public static int  test(int[] arr){
        int profit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            profit = Math.max(profit, arr[i] - minPrice);
        }
        return profit;

    }
}


/*
Dry Run
Let's perform a dry run with the example prices = [7, 1, 5, 3, 6, 4]:

Initial State
profit = 0
minPrice = Integer.MAX_VALUE
Iteration 1 (i = 0)
prices[i] = 7
minPrice = Math.min(Integer.MAX_VALUE, 7) = 7
profit = Math.max(0, 7 - 7) = 0

Iteration 2 (i = 1)
prices[i] = 1
minPrice = Math.min(7, 1) = 1
profit = Math.max(0, 1 - 1) = 0

Iteration 3 (i = 2)
prices[i] = 5
minPrice = Math.min(1, 5) = 1
profit = Math.max(0, 5 - 1) = 4

Iteration 4 (i = 3)
prices[i] = 3
minPrice = Math.min(1, 3) = 1
profit = Math.max(4, 3 - 1) = 4

Iteration 5 (i = 4)
prices[i] = 6
minPrice = Math.min(1, 6) = 1
profit = Math.max(4, 6 - 1) = 5

Iteration 6 (i = 5)
prices[i] = 4
minPrice = Math.min(1, 4) = 1
profit = Math.max(5, 4 - 1) = 5
Final State
profit = 5
So, the maximum profit is 5, which is achieved by buying at price 1 and selling at price 6.
time -0(n)
0(1) space
 */

/*
class Solution {
	int maxProfit(int[] prices) {
	    int profit = 0;
	    int minPrice = Integer.MAX_VALUE;
		for(int i = 0; i < prices.length; i++) {
			minPrice = Math.min(minPrice, prices[i]);
			profit = Math.max(profit, prices[i] - minPrice);
		}
		return profit;
	}
}




class Solution {
	int maxProfit(int[] prices) {
	    int profit = 0;
		for(int i = 0; i < prices.length; i++) {
			for(int j = i + 1; j < prices.length; j++) {
				profit = Math.max(profit, prices[j] - prices[i]);
			}
		}
		return profit;
	}
}

 */


//    // O(n^2) time, O(1) space TLE upper wala



//o(n)
//
//public class Solution {
//    public int maxProfit(int[] prices) {
//        int min = 0;
//        int mp = 0;
//
//        for (int i = 1; i < prices.length; i++) {
//            if (prices[min] > prices[i]) min = i;
//            else mp = Math.max(mp, prices[i] - prices[min]);
//        }
//
//        return mp;
//    }
//}


/*
121. Best Time to Buy and Sell Stock
Easy
22.7K
716
Companies
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

 */