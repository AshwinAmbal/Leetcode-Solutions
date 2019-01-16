class Solution {
    public int numJewelsInStones(String J, String S) {
        if(J.isEmpty() || S.isEmpty())
            return 0;
        int count = 0;
        HashMap <Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < S.length(); i++){
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i), 0) + 1);
        }
        for(int i = 0; i < J.length(); i++){
            count += map.getOrDefault(J.charAt(i), 0);
        }
        return count;
    }
}