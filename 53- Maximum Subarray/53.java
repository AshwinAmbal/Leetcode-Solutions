class Solution {
    public int maxSubArray(int[] nums) {
        int maxsoFar = nums[0], maxendsHere = nums[0];
        for(int i=1; i<nums.length;i++){
            maxendsHere = Math.max(maxendsHere + nums[i], nums[i]);
            maxsoFar = Math.max(maxendsHere, maxsoFar);
        }
        return maxsoFar;
    }   
}