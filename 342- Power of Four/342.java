class Solution {
    public boolean isPowerOfFour(int num) {
        double temp = Math.log(num) / Math.log(4);
        if(Math.pow(4, (int) temp) == num && num != 0)
            return true;
        else
            return false;
    }
}