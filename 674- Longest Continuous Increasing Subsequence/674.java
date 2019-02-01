class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 0)
            return 0;
        int curCount = 1, maxCount = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1])
                curCount++;
            else{
                maxCount = Math.max(curCount, maxCount);
                curCount = 1;
            }
        }
        return Math.max(curCount, maxCount);
    }
}