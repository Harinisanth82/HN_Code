class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0],profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            else{
                int curr_profit=prices[i]-buy;
                if(curr_profit>profit){
                    profit=curr_profit;
                }
            }
        }
        return profit;
    }
}