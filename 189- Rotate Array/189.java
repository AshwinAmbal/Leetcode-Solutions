class Solution {
    private void reverse(int[] nums, int i, int j){
    int tmp = 0;       
    while(i < j){
        tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
        i++;
        j--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        
        if(nums.length > 1){
            k = k % nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k-1);
            reverse(nums, k, nums.length-1);
        }
    }
}
