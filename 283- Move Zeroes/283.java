class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0, i;
        for(i = 0; i < nums.length; i++)
            if(nums[i] != 0)
                nums[index++] = nums[i];
        while(index < nums.length)
            nums[index++] = 0;
    }
}