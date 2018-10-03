class Solution {
    public int findMax(int left, int[]prices, int min){
        int max_profit = -1;
        while(left < prices.length){
            max_profit = Math.max(prices[left] - min, max_profit);
            left++;
        }
        return max_profit;
    }
    
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max_profit = 0, profit = 0;
        if(prices.length == 0) return 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(min > prices[i]){
                min = prices[i];
                profit = findMax(i + 1, prices, min);
                max_profit = Math.max(max_profit, profit);
            }
        }
        return max_profit;
    }
}