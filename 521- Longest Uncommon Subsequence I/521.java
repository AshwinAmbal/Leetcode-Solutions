class Solution {
    public int findLUSlength(String a, String b) {
        if(a.length() != b.length() || !a.equals(b))
            return Math.max(a.length(), b.length());
        return -1;   
    }
}