class Solution {
    public String reverseStr(String s, int k) {
        if(s.length() == 0)
            return "";
        StringBuilder str = new StringBuilder(s);
        String fin = "";
        int l = str.length();
        int i = 0;
        while(i < l){
            if(i + 2*k < l)
                fin += new StringBuilder(s.substring(i, i + k)).reverse() + s.substring(i + k, i + 2*k);
            else if(i + k < l)
                fin += new StringBuilder(s.substring(i, i + k)).reverse() + s.substring(i + k);
            else if(i + k >= l && i < l)
                fin += new StringBuilder(s.substring(i)).reverse();
            i += 2*k;
        }
        return fin;
    }
}