class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        List<Character> coll = new ArrayList<Character>();
        for(int i = 0; i< s.length(); i++)
            coll.add(s.charAt(i));
        System.out.print(coll);
        for(int i = 0; i< t.length(); i++)
            if(coll.contains(t.charAt(i)) == true)
                coll.remove(new Character(t.charAt(i)));
            else
                return false;
        if(coll.isEmpty()){
            return true;
        }
        else
            return false;
        
    }
}