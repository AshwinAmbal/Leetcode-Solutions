class Solution {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder pattern = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(pattern.length() > 0 && s.charAt(i) == pattern.charAt(0) && s.length() % pattern.length() == 0){
                int count = s.length() / pattern.length();
                StringBuilder temp = new StringBuilder();
                while(count > 0){
                    temp.append(pattern);
                    count--;
                }           
                if(temp.toString().equals(s))
                    return true;
            }
            if(pattern.length() * 2 > s.length())
                break;
            pattern.append(s.charAt(i));
            
        }
        return false;
    }
}