class Solution {
    public int maxProfit(int[] prices) {
        //maximum profit 
        // if(prices.length == 1) return prices;
        int profit = 0;
        for(int i = 1  ; i<prices.length ; i++){
            if(prices[i] > prices[i-1]){
                profit = profit + (prices[i] - prices[i-1]);
            }
        }
        return profit;
        
    }
}