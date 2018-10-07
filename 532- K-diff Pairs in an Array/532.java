class Solution {
    public int findPairs(int[] nums, int k) {
        if(k < 0) return 0;
        int totPair = 0;
        HashMap <Integer, Integer> num = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            num.put(nums[i], num.getOrDefault(nums[i], 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: num.entrySet()){
            if(k != 0 && num.getOrDefault(entry.getKey() - k, 0) > 0){
                totPair += 1;
            }
            else if(k == 0)
                totPair += entry.getValue() > 1 ? 1 : 0;
        }
        return totPair;
    }
}