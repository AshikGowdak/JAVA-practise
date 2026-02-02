// Best Time to Buy and Sell Stock

public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }

    public static int maxProfit(int[] prices) {
      int minPrice = prices[0];                                     // minimum price so far
        int maxProfit = 0;                                          // maximum profit so far

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];                               // update minimum buying price
            }
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);  // update maximum profit
            
        }
        return maxProfit;
    }
}


// Time Complexity: O(n) - We traverse the prices array once.
// Space Complexity: O(1) - We use constant extra space.
// output:
// Maximum Profit: 5