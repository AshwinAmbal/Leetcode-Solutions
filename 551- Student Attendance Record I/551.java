class Solution {
    public boolean checkRecord(String s) {
        int countA = 0, count_LC = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A')
                countA++;
            
            if(i < s.length() - 2 && s.charAt(i) == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L')
                count_LC++;
                
            if(countA > 1 || count_LC > 0)
                return false;
        }
        return true;
    }
}