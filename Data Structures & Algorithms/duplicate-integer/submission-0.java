class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> dic = new HashSet();
        for(int i=0;i<nums.length;i++){
            if(dic.contains(nums[i])){
                return true;
            }else{
                dic.add(nums[i]);
            }
        }
        return false;
    }
}