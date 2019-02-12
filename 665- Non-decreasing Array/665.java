class Solution {
    public boolean checkPossibility(int[] nums) {
        int i, count = 0, curMax = Integer.MIN_VALUE, curMin = Integer.MAX_VALUE;
        for(i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]){
                count++;
                break;
            }
        }
        if(count == 0)
            return true;
        else{
            int temp = nums[i];
            nums[i] = nums[i+1];
            if(isError(nums)){
                nums[i+1] = nums[i] = temp;
                if(isError(nums))
                    return false;
            }
            return true;
        }
    }
    
    boolean isError(int [] nums){
        for(int i = 0; i < nums.length - 1; i++)
            if(nums[i] > nums[i+1])
                return true;
        return false;
    }
}