class Solution {
    public int mySqrt(int x) {
        if(x<=0)
            return 0;
        int left= 1, right = x, mid;
        while(left + 1 < right){
            mid = (left + right) / 2;
            if(mid == x/mid)
                return mid;
            else if(x/mid<mid)
                right = mid;
            else
                left = mid;
        }
        return left;
    }
}