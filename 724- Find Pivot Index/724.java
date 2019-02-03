class Solution {
    public int pivotIndex(int[] nums) {
        int [] left = new int[nums.length]; 
        int [] right = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++)
            sum += nums[i];
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                left[i] = 0;
                right[i] = sum - nums[i];
                
            }
            else if(i == nums.length - 1){
                left[i] = left[i-1] + nums[i-1];
                right[i] = 0;
            }
            else{
                left[i] = left[i-1] + nums[i-1];
                right[i] = right[i-1] - nums[i];
            }
        }
        for(int i = 0; i < nums.length; i++)
            if(left[i] == right[i])
                return i;
        return -1;
    }
}