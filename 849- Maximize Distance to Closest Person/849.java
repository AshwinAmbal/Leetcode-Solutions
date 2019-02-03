class Solution {
    public int maxDistToClosest(int[] seats) {
        int curCount = 0, maxCount = 0, k = 0, startCount = 0;
        while(seats[k++] == 0)
            startCount++;
        for(int i = k; i < seats.length; i++){
            if(seats[i] == 0){
                curCount++;
            }
            else{
                maxCount = Math.max(maxCount, curCount);
                curCount = 0;
            }
        }
        int count = Math.max(startCount, curCount);
        maxCount = (maxCount % 2 == 0) ? maxCount / 2 : maxCount / 2 + 1;
        return Math.max(maxCount, count);
    }
}