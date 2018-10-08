class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int first = 0, last = nums.length - 1, flag1 = 0, flag2 = 0;
        while(first < last){
            System.out.println(first + " " + last);
            if(nums[first] <= nums[first + 1] && nums[first] <= nums[last]){
                flag1 = 0;
            }
            else
                flag1 = 1;
            if(nums[last] >= nums[last - 1] && nums[first] <= nums[last])
                flag2 = 0;
            else
                flag2 = 1;
            
            if(flag1 == 0)
                first++;
            if(flag2 == 0)
                last--;
            if(flag1 == 1 && flag2 ==1){
                break;
            }
        }
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        if(first == -1 || last == first)
            return 0;
        for(int i = first; i <= last; i++){
            max = Math.max(nums[i], max);
            min = Math.min(nums[i], min);
        }
        for(int i = 0; i < first; i++){
            if(nums[i] > min){
                first = i;
                break;
            }
        }
        for(int i = nums.length - 1; i > last; i--){
            if(nums[i] < max){
                last = i;
                break;
            }
        }
        return last - first + 1;
    }
}