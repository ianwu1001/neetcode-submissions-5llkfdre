class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        maxProfit = 0
        if len(prices) < 2 :
            return maxProfit


        for i, price in enumerate(prices):
            buy = price
            sellDate = i + 1

            if sellDate >= len(prices):
                break

            curProfit = prices[sellDate] - buy

            while sellDate < len(prices) - 1:
                sellDate += 1
                curProfit = max(curProfit, prices[sellDate] - buy)
            
            maxProfit = max(maxProfit, curProfit)

        return maxProfit



