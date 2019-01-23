class Solution {
    public String reverseOnlyLetters(String S) {
        StringBuilder str = new StringBuilder(S);
        int flag1 = 0, flag2 = 0;
        for(int i = 0, j = str.length() - 1; i < j;){
            if(S.charAt(i) >= 'A' && S.charAt(i) <= 'Z' || S.charAt(i) >= 'a' && S.charAt(i) <= 'z' )
                flag1 = 1;
            if(S.charAt(j) >= 'A' && S.charAt(j) <= 'Z' || S.charAt(j) >= 'a' && S.charAt(j) <= 'z' )
                flag2 = 1;
            if(flag1 == 1 && flag2 == 1){
                str.setCharAt(i, S.charAt(j));
                str.setCharAt(j, S.charAt(i));
                flag1 = flag2 = 0;
                i++;
                j--;
            }
            else if(flag1 != 1)
                i++;
            else
                j--;
        }
        return str.toString();
    }
}