package Leetcode;

public class Buy_SellStock {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(test(arr));
    }
    public static int  test(int[] arr){
     int profit = 0;
     for(int i =0;i<arr.length;i++){
         for(int j =i;j>=0;j--){
             profit = Math.max(profit,arr[i]-arr[j]);
         }
     }
     return profit;

    }
}


/*
class Solution {
	int maxProfit(int[] prices) {
	    int profit = 0, minPrice = Integer.MAX_VALUE;
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