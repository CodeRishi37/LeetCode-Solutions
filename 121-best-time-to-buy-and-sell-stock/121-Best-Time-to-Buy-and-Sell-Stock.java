class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = 10001;
        int maxProfit = 0;
        int i = 0;
        int n = prices.length-1;
        while(i<=n){
            if(minPrice>prices[i]){
                minPrice = prices[i];
            }else{
                maxProfit = Math.max(maxProfit,prices[i]-minPrice);
            }
            i++;

        }
        return maxProfit;
    }
}