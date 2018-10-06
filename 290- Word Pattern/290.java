class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap <String, Character> map = new HashMap <String, Character>();
        String[] s = str.split("\\s+");
        if(pattern.length() != s.length) return false;
        for(int i = 0; i < s.length; i++){
            if(map.get(s[i]) == null && map.values().contains(pattern.charAt(i)) == false){
                map.put(s[i], pattern.charAt(i));
            }
            else{
                if(map.get(s[i]) == null || map.get(s[i]) != pattern.charAt(i))
                    return false;
            }
        }
        return true;
    }
}