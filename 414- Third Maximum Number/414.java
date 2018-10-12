class Solution {
    public int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE, flag1 = 0, flag2 = 0, flag3 = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == Integer.MIN_VALUE && nums[i] == max1){
                max1 = nums[i];
                flag1 = 1;
            }
            else if(nums[i] == Integer.MIN_VALUE && nums[i] == max2){
                max1 = nums[i];
                flag2 = 1;
            }
            else if(nums[i] == Integer.MIN_VALUE && nums[i] == max3){
                max1 = nums[i];
                flag3 = 1;
            }
            if(nums[i] == max1 || nums[i] == max2 || nums[i] == max3)
                continue;
            else if(nums[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
                if(flag2 == 1)
                    flag3 = 1;
                if(flag1 == 1)
                    flag2 = 1;
            }
            else if(nums[i] > max2){
                max3 = max2;
                max2 = nums[i];
                if(flag2 == 1)
                    flag3 = 1;
            }
            else if(nums[i] > max3){
                max3 = nums[i];
            }
        }
        return max3 == Integer.MIN_VALUE && flag3 == 0 ? max1 : max3;
    }
}