class Solution {
    public String convertToTitle(int n) {
        StringBuilder str = new StringBuilder();
        while(n > 0){
            char val = (char)((n - 1) % 26 + 'A');
            n = (n - 1) / 26;
            str.insert(0, val);
        }        
        return str.toString();
    }
}