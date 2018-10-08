class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length == 1 && flowerbed[0] == 0)
            return true;
        int i;
        for(i = 0; i < flowerbed.length - 1; ){
            if(flowerbed[i] == 0 && flowerbed[i+1] == 0){
                    n -= 1;
                    i += 2;
            }
            else if(flowerbed[i] == 1)
                i += 2;
            else if(flowerbed[i + 1] == 1)
                i += 3;
        }
        if(i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i-1] == 0)
            n -= 1;
        if(n <= 0) 
            return true;
        else
            return false;
        
    }
}