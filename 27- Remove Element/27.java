class Solution {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for(int i = 0 ; i < len ; i++){
            while(nums[i] == val && i < len){
                for(int j = i; j < len-1; j++)
                    nums[j] = nums[j+1];
                nums[len-1] = 0;
                len--;
            }
        }
        return len;
    }
}