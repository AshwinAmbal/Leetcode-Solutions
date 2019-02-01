class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int k = 0, i = 0;
        if(typed.length() < name.length())
            return false;
        while(k < name.length() && i < typed.length()){
            if(name.charAt(k) == typed.charAt(i)){
                i++;
                k++;
            }
            else if(i > 0 && typed.charAt(i) == typed.charAt(i-1))
                i++;
            else
                return false;
        }
        if(k == name.length())
            return true;       
        else 
            return false;
    }
}