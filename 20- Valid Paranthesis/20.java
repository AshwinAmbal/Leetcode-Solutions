class Solution {
    public boolean isValid(String s) {
        Stack <Character> st = new Stack<Character>();
        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(')
                st.push((Character)s.charAt(i));
            else if(st.empty() && (s.charAt(i) == ']' || s.charAt(i) == ')' || s.charAt(i) == '}'))
                    return false;
            else{ 
                if(s.charAt(i) == ']'){
                    if((char)st.peek() == '[')
                        st.pop();
                    else
                        return false;
                }
                else if(s.charAt(i) == '}'){
                    if((char)st.peek() == '{')
                        st.pop();
                    else
                        return false;
                }
                else if(s.charAt(i) == ')'){
                    if((char)st.peek() == '(')
                        st.pop();
                    else    
                        return false;
                }
            }
        }
        if(st.empty())
            return true;
        else
            return false;
    }
}