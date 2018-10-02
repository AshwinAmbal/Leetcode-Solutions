class Solution {
    public int lengthOfLastWord(String s) {
        if(s.trim().isEmpty() || s == null) return 0;
        String [] words = s.split("\\s+");
        return words[words.length -1].length();
    }
}