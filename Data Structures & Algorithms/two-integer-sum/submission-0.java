class Solution {
    public int[] twoSum(int[] nums, int target) {

        // 因為一邊遍歷一邊存，不會存在key衝突問題
        Map<Integer, Integer> map = new HashMap();

        for(int i = 0; i < nums.length; i++){
            int complement = target -nums[i];

            if(!map.containsKey(complement)){
                map.put(nums[i],i);                
            }else{
                return new int[] { map.get(complement), i };
            }
        }
        
        // 理論上不會觸發
        return new int[] {};
    }
}
