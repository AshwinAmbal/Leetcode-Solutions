class Solution {
    public char findTheDifference(String s, String t) {
        if(s.isEmpty())
            return t.charAt(0);
        char res = s.charAt(0);
        for(int i = 1; i < s.length(); i++)
            res ^= s.charAt(i);
        for(int i = 0; i < t.length(); i++)
            res ^= t.charAt(i);
        return res;
    }
}