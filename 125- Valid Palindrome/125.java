class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder t = new StringBuilder(s.replaceAll("[^A-Za-z0-9]", ""));
        StringBuilder st = new StringBuilder(t);
        t.reverse();
        System.out.println(t +"\n" + st);
        if(t.toString().equalsIgnoreCase(st.toString()))
            return true;
        else
            return false;
    }
}