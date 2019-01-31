class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack str1 = new Stack<Character>(), str2 = new Stack<Character>();
        int i = 0;
        for(i = 0; i < S.length(); i++){
            if(S.charAt(i) != '#')
                str1.push(S.charAt(i));
            else
                if(!str1.isEmpty())
                    str1.pop();
        }
        for(i = 0; i < T.length(); i++){
            if(T.charAt(i) != '#')
                str2.push(T.charAt(i));
            else
                if(!str2.isEmpty())
                    str2.pop();
        }
        char ch1, ch2;
        while(str1.isEmpty() != true && str2.isEmpty() != true){
            ch1 = (char) str1.pop();
            ch2 = (char) str2.pop();
            if(ch1 != ch2)
                return false;
        }
        if(str1.isEmpty() && str2.isEmpty())
            return true;
        else
            return false;
            
    }
}