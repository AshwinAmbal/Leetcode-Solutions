class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>(nums.length);
        int temp = -1;
        for(int i = 0; i< nums.length; i++){
            if(hash.containsKey(nums[i])){
                hash.put(nums[i], hash.get(nums[i]) + 1);
                continue;
            }
            hash.put(nums[i], 1);
            
        }
        for(Integer i : hash.keySet()){
            if(hash.get(i) == 1)
                temp = i;
        }
        if(hash.isEmpty()) return 0;
        return temp;
    }
}