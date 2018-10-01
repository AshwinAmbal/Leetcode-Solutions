class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len-1; i++){
            while(nums[i] == nums[i+1] && i < len-1){
                for(int j = i; j < len-1; j++){
                    nums[j] = nums[j+1];
                }
                nums[len-1] = 0;
                len--; 
            }
        }
        return len;
    }
}