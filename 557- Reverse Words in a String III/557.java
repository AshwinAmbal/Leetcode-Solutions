class Solution {
    public String reverseWords(String s) {
        if(s == "") return s;
        String[] str = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < str.length; i++){
            result.append(new StringBuilder(str[i]).reverse());
            if(i != str.length - 1)
                result.append(" ");
        }
        return result.toString();
    }
}