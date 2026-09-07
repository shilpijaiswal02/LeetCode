class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }else{
                int currProfit=prices[i]- minPrice;
                if(currProfit>maxprofit){
                    maxprofit=currProfit;
                }
            }
        }
        return maxprofit;
    }
}