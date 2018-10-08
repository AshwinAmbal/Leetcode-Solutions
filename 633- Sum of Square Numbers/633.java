class Solution {
    public boolean judgeSquareSum(int c) {
        double a = 0;
        for(long b = 0; b * b <= c; b++){
            a = Math.sqrt(c - b * b);
            if(a == (int) a)
                return true;
        }
        return false;
    }
}