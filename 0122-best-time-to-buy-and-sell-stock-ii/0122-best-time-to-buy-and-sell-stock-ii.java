class Solution {
    public int maxProfit(int[] prices) {
        int len=prices.length;
        int min=0;
        for(int i=1;i<len;i++){
            if(prices[i]>prices[i-1]){
                min+=prices[i]-prices[i-1];
            }
        }
        return min;
    }
}