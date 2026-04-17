class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count_map = {}
        for n in nums:
            count_map[n] = count_map.get(n, 0) + 1    

        sorted_items = sorted(count_map.items(), key=lambda item: item[1], reverse=True)

        result = []
        for i in range(k):
            result.append(sorted_items[i][0])
            
        return result
        