class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;
        HashMap <Character, Integer> find_index = new HashMap<Character, Integer>();
        int start = 0, st = 0, curr_len = 1, max_len = 1, i;
        find_index.put(s.charAt(st), 0);
        for(i = 1; i < s.length(); i++){
            if(find_index.get(s.charAt(i)) == null)
                find_index.put(s.charAt(i), i);
            else{
                if(find_index.get(s.charAt(i)) >= st){
                    curr_len = i - st;
                    if(curr_len > max_len){
                        max_len = curr_len;
                        start = st;
                    }
                    st = find_index.get(s.charAt(i)) + 1;
                }
                find_index.put(s.charAt(i), i);      
            }
        }
        if(i - st > max_len){
            max_len = i - st;
            start = st;
        }
        return max_len;
    }
}