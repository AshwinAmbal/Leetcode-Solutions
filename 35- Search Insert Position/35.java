class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        for(i= 0 ; i<nums.length && target > nums[i]; i++) ;
        if(i!=0 && nums[i-1] == target) return i-1;
        else return i;
    }
}