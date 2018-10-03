class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 0) return Integer.MIN_VALUE;
        HashMap <Integer, Integer> hash = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(hash.get(nums[i]) != null)
                hash.put(nums[i], hash.get(nums[i]) + 1);
            else
                hash.put(nums[i], 1);
        }
        Map.Entry<Integer, Integer> req = null;
        for(Map.Entry<Integer, Integer> it: hash.entrySet()){
            if(req == null || it.getValue() > req.getValue())
                req = it;
        }
        if(req.getValue() > nums.length/2)
            return req.getKey();
        else
            return Integer.MIN_VALUE;
    }
}