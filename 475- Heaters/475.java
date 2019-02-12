class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int min = 0;
        for(int i = 0; i < houses.length; i++){
            min = Math.max(findClosestHeater(houses[i], heaters), min);
        }
        return min;
    }
    
    int findClosestHeater(int val, int [] heaters){
        int left = 0, right = heaters.length-1, mid;
        while(left <= right){
            mid = left + (right - left) / 2;
            if(heaters[mid] == val)
                return 0;
            else if(heaters[mid] < val)
                left = mid + 1;
            else
                right = mid - 1;
        }
        int leftMin = left < heaters.length ? Math.abs(val - heaters[left]) : Integer.MAX_VALUE;
        int rightMin = right >= 0 ? Math.abs(val - heaters[right]) : Integer.MAX_VALUE;
        return Math.min(rightMin, leftMin);
    }
        
}