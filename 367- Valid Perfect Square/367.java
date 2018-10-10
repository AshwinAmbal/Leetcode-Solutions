class Solution {
    int sqrt(int x){
        if(x <= 0) return 0;
        int left = 1, right = x;
        while(left + 1 < right){
            int mid = left + (right - left) / 2;
            if(mid == x / mid)
                return mid;
            else if(mid > x / mid)
                right = mid;
            else
                left = mid;
        }
        return left;
    }
    
    public boolean isPerfectSquare(int num) {
        if(num == 0)
            return false;
        int n = sqrt(num);
        if(n * n == num )
            return true;
        return false;
    }
}