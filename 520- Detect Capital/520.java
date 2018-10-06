class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for(int i = 0; i< word.length(); i++){
            if('Z' - word.charAt(i) >= 0){
                count++;
            }
        }
        if(count == 0 || count == word.length())
            return true;
        if(count == 1 && 'Z' - word.charAt(0) >= 0)
            return true;
        return false;
    }
}