class Solution {
    public int search(int[] nums, int target) {
        int first = 0, last = nums.length - 1, mid = -1;
        while(first <= last){
            mid = first + (last - first) / 2;
            if(nums[mid] == target)
                return mid;
            else if(target < nums[mid])
                last = mid - 1;
            else
                first = mid + 1;
        }
        return -1;
    }
}