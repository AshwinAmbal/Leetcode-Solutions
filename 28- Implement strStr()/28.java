class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.isEmpty()) return 0;
        if(haystack == null || needle == null) return -1;
        boolean flag = true;
        int loc = -1, j, k;
        for(int i = 0; i<haystack.length(); i++){
            flag = true;
            for(j = 0, k=i; j<needle.length() && k<haystack.length(); j++, k++){
                if(needle.charAt(j) != haystack.charAt(k))
                {
                    flag = false;
                    break;
                }
            }
            if(k == haystack.length() && j!= needle.length()) flag = false;
            if(flag != false){ loc = i; break;}
            
        }
        return loc;
    }
}