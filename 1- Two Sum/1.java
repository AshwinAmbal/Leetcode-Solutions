import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, required = 0, loc1 = -1, loc2 = -1;
        for(i = 0; i < nums.length - 1; i++){
            required = target - nums[i];
            for(int j = i + 1;j < nums.length; j++){
                if(nums[j] == required){
                    loc1 = i;
                    loc2 = j;
                    break;
                }
            }
            if(loc1 != -1 && loc2 != -1) break;
        }
        int[] req = {loc1, loc2};
        return req;
    }
}
