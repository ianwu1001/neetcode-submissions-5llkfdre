class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int diff = 0;

        while (left < prices.length){

            for(int i = left + 1; i < prices.length ; i++ ){
                diff= Math.max((prices[i]-prices[left]),diff);
            }            

            left ++;
        }

        return diff > 0 ? diff: 0;
    }
}
