class Solution {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int i = 1, flag = 0, val = nums[0];
        while(i < len) {
            
              if(val == nums[i]){
                flag++;
                if(flag >= 2 ){
                    for(int j = i; j < len-1; j++)
                        nums[j] = nums[j+1];
                    len--;
                    i--;
                }
            }
            else{
                    flag = 0;
                    val = nums[i];
                }
            i++;
        }
        return len;
    }
}