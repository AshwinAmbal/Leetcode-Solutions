class Solution {
    public boolean isPowerOfTwo(int n) {
        double temp = Math.log(n) / Math.log(2);
        if(Math.pow(2, (int) temp) == n && n != 0)
            return true;
        else
            return false;
    }
}