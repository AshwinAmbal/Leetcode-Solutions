class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character, Integer> magCount = new HashMap<Character, Integer>();
        for(int i = 0; i < magazine.length(); i++)
            magCount.put(magazine.charAt(i), magCount.getOrDefault(magazine.charAt(i), 0) + 1);
        for(int i = 0; i < ransomNote.length(); i++)
            if(magCount.getOrDefault(ransomNote.charAt(i), 0) == 0)
                return false;
            else
                magCount.put(ransomNote.charAt(i), magCount.get(ransomNote.charAt(i)) - 1);
        return true;
    }
}