class Solution {
    public String toHex(int num) {
        if(num == 0)
            return "0";
        long n = num & 0x00000000ffffffffL;
        long rem;
        StringBuilder str = new StringBuilder();
        while(n != 0){
            rem = n % 16;
            n /= 16;
            if(rem > 9){
                rem %= 10;
                str.append((char)('a' + rem));
            }
            else
                str.append(rem);
        }
        return str.reverse().toString();
    }
}