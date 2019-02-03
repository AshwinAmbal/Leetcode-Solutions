class Solution {
    public int[] findErrorNums(int[] nums) {
        int [] result = new int[2];
        int req = nums.length * (nums.length + 1) / 2;
        for(int i = 0; i < nums.length; i++){
            if (nums[Math.abs(nums[i]) - 1] < 0)
                result[0] = Math.abs(nums[i]);
            else{
                req -= Math.abs(nums[i]);
                nums[Math.abs(nums[i]) - 1] *= -1;
            }
        }
        result[1] = req;
        return result;
    }
}