class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int rev = 0, rem, temp = x;
        while(temp != 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp /= 10;
        }
        if(x == rev)
            return true;
        return false;
    }
}