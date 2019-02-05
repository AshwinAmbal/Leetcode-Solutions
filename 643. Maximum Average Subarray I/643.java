class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int count = 0;
        double sum = 0, avg = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            count++;
            if(count == k){
                avg = Math.max(avg, sum/k);
                sum -= nums[i-k+1];
                count--;
            }   
        }
        if(nums.length < k)
            return sum/k;
        return count != k-1 ? Math.max(avg, sum/k) : avg;
    }
}