class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        int k=0, flag;
        char temp;
        if(strs.length > 1){
        while(true){
            if(k == strs[0].length())
                break;
            temp = strs[0].charAt(k);
            flag = 1;
            for(int i = 1; i < strs.length; i++){
                if(k == strs[i].length()){
                    flag = 0;
                    break;
                }
                if(strs[i].charAt(k) != temp){
                    flag = 0;
                    break;
                }
                
            }
            if(flag == 1)
                str += temp;
             else
                break;
            k++;   
        }
    }
    else if(strs.length == 1){
        str = strs[0];
        }
        return str;
    }
}