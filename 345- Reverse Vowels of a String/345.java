class Solution {
    private boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c) != -1;
    }
    
    public String reverseVowels(String s) {
        int front = 0, last = s.length() - 1, flag1 = 0, flag2 = 0;
        char temp;
        StringBuilder str = new StringBuilder(s);
        while(front <= last){
            
            if(isVowel(s.charAt(front)) && isVowel(s.charAt(last))){
                temp = str.charAt(front);
                str.setCharAt(front, str.charAt(last));
                str.setCharAt(last, temp);
                flag1 = 0;
                flag2 = 0;
                front++;
                last--;
            }
            else if(isVowel(s.charAt(front)) && !isVowel(s.charAt(last))){
                last--;
            }
            else if(!isVowel(s.charAt(front)) && isVowel(s.charAt(last))){
                front++;
            }
            else{
                front++;
                last--;
            }
        }
        return str.toString();
    }
}