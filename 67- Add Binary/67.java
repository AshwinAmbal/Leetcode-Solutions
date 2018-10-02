class Solution {
    String replaceAt(String s, char c, int i){
        return s.substring(0, i) + c + s.substring(i+1);
    }
    
    public String addBinary(String a, String b) {
        int flag = 0, i, j, n1 = a.length(), n2 = b.length(), t;
        String temp, result;
        if(n1<n2){
            temp = a;
            t = n1;
            a = b;
            n1 = n2;
            b = temp;
            n2 = t;
        }
        j = n1 - 1;
        result = a;
        for(i = n2 - 1; i>= 0; i--, j--){
            if(a.charAt(j) == '0' && b.charAt(i)== '0'){
                if(flag == 0) 
                    result = replaceAt(result, '0', j);
                else{ 
                    result = replaceAt(result, '1', j);
                    flag = 0;
                }
            }
            else if(a.charAt(j) == '0' && b.charAt(i)== '1' || a.charAt(j) =='1' && b.charAt(i) == '0'){
                if(flag == 1) {
                    result = replaceAt(result, '0', j);
                    flag = 1;
                }
                else 
                    result = replaceAt(result, '1', j);
                    
            }
            else if(a.charAt(j) == '1' && b.charAt(i)== '1'){
                if(flag == 1) {
                    result = replaceAt(result, '1', j);
                    flag = 1;
                }
                else{ 
                    result = replaceAt(result, '0', j);
                    flag = 1;
                }
            }
        }
        i = n1 - n2 - 1;
        while(i>=0 && a.charAt(i) == '1' && flag == 1){
            result = replaceAt(result, '0', i);
            i--;
        }
        if(flag == 1 && i>=0){
            result = replaceAt(result, '1', i);
            i--;
            flag = 0;
        }
        if(i>=0) {
            while(i >= 0){
                result = replaceAt(result, a.charAt(i), i);
                i--;
            }
        }
        else if(flag == 1 && i<0){
            result = "1" + result;
        }
        return result;
    }
}