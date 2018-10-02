class Solution {
    public String countAndSay(int n) {
        int val = 1, count;
        if(n == 1) return Integer.toString(val);
        String str = "", temp="";
        str += Integer.toString(val);
        for(int i = 1; i<n; i++){
            temp = "";
            for(int j=0; j<str.length(); ){
                
                char c = str.charAt(j);
                count = 0;
                while(j<str.length() && c == str.charAt(j)){
                    count++;
                    j++;
                }
                temp+=Integer.toString(count) + c;
            }
            str = temp;
        }
        return str;
    }
}