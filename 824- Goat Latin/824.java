class Solution {
    public String toGoatLatin(String S) {
        if(S.isEmpty())
            return "";
        String [] words = S.split("\\s+");
        StringBuilder str = new StringBuilder();
        int i = 0;
        for(String s : words){
            if("AEIOUaeiou".indexOf(s.charAt(0)) < 0){
                str.append(s.substring(1));
                str.append(s.charAt(0) + "ma");
            }
            else{
                str.append(s);
                str.append("ma");
            }
            int j = 0;
            while(j++ <= i)
                str.append("a");
            i++;
            str.append(" ");
        }
        return str.toString().trim();
    }
}