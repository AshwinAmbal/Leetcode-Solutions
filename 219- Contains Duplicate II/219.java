class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap <Integer, Integer> dict = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(dict.get(nums[i]) != null ){
                if(Math.abs(i - dict.get(nums[i])) <= k)
                    return true;
                else
                    dict.put(nums[i], i);
            }
            else
                dict.put(nums[i], i);
        }
        return false;
    }
}