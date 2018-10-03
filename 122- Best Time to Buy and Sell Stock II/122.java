class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0, min, i = 0;
        while(i<prices.length - 1){
            while(i < prices.length - 1 && prices[i + 1] <= prices[i]) i++;
            min = prices[i++];
            while(i < prices.length - 1 && prices[i+1] >= prices[i]) i++;
            profit += i < prices.length? prices[i] - min : 0;
        }
        return profit;
    }
}