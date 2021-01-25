/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Range {
    int low;
    int high;
    Range(int low, int high){
        this.low = low;
        this.high = high;
    }
    int getProfit() {
        return high - low;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
        List<Range> ranges = new LinkedList<>();
        int lowestPrice = prices[0];
        int highestPrice = lowestPrice;
        for (int day = 0; day < prices.length; ++day){
            int currentPrice = prices[day];
            if (currentPrice > highestPrice){
                highestPrice = currentPrice;
            }
            if (currentPrice < lowestPrice || day + 1 == prices.length) {
                ranges.add(new Range(lowestPrice, highestPrice));
                lowestPrice = currentPrice;
                highestPrice = currentPrice;
            }
        }
        return ranges.stream().map(Range::getProfit).reduce(Integer::max).orElse(0);
    }
}
// @lc code=end

