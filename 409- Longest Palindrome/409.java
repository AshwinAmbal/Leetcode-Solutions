class Solution {
    public int longestPalindrome(String s) {
        int [] count = new int[58];
        int flag = 0, len = 0;
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'A']++;
        }
        for(int i = 0; i < 58; i++){
            while(count[i] >= 2){
                len += 2;
                count[i] -= 2;
            }
            if(count[i] == 1)
                flag = 1;
        }
        if(flag == 1)
            len += 1;
        return len;
    }
}