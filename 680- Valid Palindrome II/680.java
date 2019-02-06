class Solution {
    public boolean validPalindrome(String s) {
        if(s.equals(""))
            return true;
        return validPalindromeHelper(s, 0);
        
    }
    boolean validPalindromeHelper(String s, int count){
        if(count > 1)
            return false;
        int i = 0, j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                boolean right = false, left = false;
                if(s.charAt(i) == s.charAt(j-1))
                    right = validPalindromeHelper(s.substring(i, j), count+1);
                if(s.charAt(i+1) == s.charAt(j))
                    left = validPalindromeHelper(s.substring(i+1, j+1), count+1);
                return left || right;
            }
        }
    return true;
    }
}