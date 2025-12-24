class Solution {
    public int maxProfit(int[] prices) {
        // int profit=0;
        // int buy=0;
        // for(int i=0;i<prices.length;i++){
        //         int sell=0;
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[i]>prices[j] || sell>prices[j]){
        //             continue;
        //         }
            
        //         if(sell<prices[j] && prices[i]<prices[j]){
        //             int curprof=prices[j]-prices[i];

        //             if(curprof>profit){
        //                 profit=curprof;
        //                 sell=prices[j];
        //             }
        //         }
        //     }
        // }
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            // 1. Update the minimum price seen so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            // 2. Calculate profit if we sold today and compare to maxProfit
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}