class Solution {
    public int findLHS(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap <Integer, Integer>();
        int max = 0, count = 0;
        for(int i = 0; i < nums.length; i++){
            if(map.get(nums[i]) != null)
                map.put(nums[i], map.get(nums[i]) + 1);
            else
                map.put(nums[i], 1);
        }
        for(int i = 0; i< nums.length; i++){
            if(map.get(nums[i]) != null && map.get(nums[i] - 1) != null){
                count = map.get(nums[i]) + map.get(nums[i] - 1);
                max = Math.max(count, max);
            }
        }
        return max;
    }
}