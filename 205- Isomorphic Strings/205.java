class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap <Character, Character> map = new HashMap <Character, Character>();
        int i;
        for(i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) == null && map.containsValue(t.charAt(i)) == false)
                map.put(s.charAt(i), t.charAt(i));
            else if(map.get(s.charAt(i)) == null || map.get(s.charAt(i)) != t.charAt(i))
                break;
        }
        if(i == s.length())
            return true;
        else
            return false;
    }
}