class Solution {
    public int titleToNumber(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            int val = (int) (s.charAt(s.length() - i - 1) - 'A' + 1);
            count += val * Math.pow(26, i);
        }
        return count;
    }
}