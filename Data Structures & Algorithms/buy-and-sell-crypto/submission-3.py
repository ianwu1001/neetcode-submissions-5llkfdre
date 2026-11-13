class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minPriceBefore, maxProfit = 0, 0

        if len(prices) < 2 :
            return maxProfit

        minPriceBefore = prices[0]

        for p in prices:
            curProfit = p - minPriceBefore
            maxProfit = max (curProfit, maxProfit)
            minPriceBefore = min(minPriceBefore, p)
        
        return maxProfit
