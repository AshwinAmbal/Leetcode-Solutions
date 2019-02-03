class Solution {
    public int dominantIndex(int[] nums) {
        int curMax = -1, doubleMax = 0, max = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > curMax){
                curMax = nums[i];
                max = i;
            }
        }
        for(int i = 0; i < nums.length; i++){
            if(nums[i] * 2 > doubleMax && i != max)
                doubleMax = nums[i] * 2;
        }
        if(curMax >= doubleMax)
            return max;
        else
            return -1;
    }
}