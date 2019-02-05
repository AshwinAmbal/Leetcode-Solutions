class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int [] count_p = new int[26];
        int [] count_s = new int[26];
        List<Integer> startIndex = new ArrayList<Integer>();
        int size = p.length(), count = 0;
        for(int i = 0; i < p.length(); i++)
            count_p[p.charAt(i) - 'a'] += 1;
        for(int i = s.length() - 1; i >= 0 ; i--){
            count_s[s.charAt(i) - 'a'] += 1;
            count++;
            if(count == size){
                int flag = 0;
                for(int k = 0; k < 26; k++)
                    if(count_p[k] != count_s[k]){
                        flag = 1;
                        break;
                    }
                if(flag == 0)
                    startIndex.add(i);
                count_s[s.charAt(i+count-1) - 'a'] -= 1;
                count--;
            }
        }
        return startIndex;
    }
}