class Solution {
    public int getRomanvalue(char c){
        int x = 0;
        switch(c){
            case 'I' : x = 1;
                        break;
            case 'V' : x = 5;
                        break;
            case 'X' : x = 10;
                        break;
            case 'L' : x = 50;
                        break;
            case 'C' : x = 100;
                        break;
            case 'D' : x = 500;
                        break;
            case 'M' : x = 1000;
                        break;
        }
        return x;
    }
    
    public int romanToInt(String s) {
        int val = 0, total = 0, c = 0;
        for(int i = 0 ; i < s.length() ; i++){
        if(i != s.length()-1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                total+=4;
                i += 1;
                continue;
            }
            if(i != s.length()-1 && s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                total+=9;
                i += 1;
                continue;
            }
            if(i != s.length()-1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                total+=40;
                i += 1;
                continue;
            }
            if(i != s.length()-1 && s.charAt(i) == 'X' && s.charAt(i+1) == 'C'){
                total+=90;
                i += 1;
                continue;
            }
            if(i != s.length()-1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                total+=400;
                i += 1;
                continue;
            }
            if(i != s.length()-1 && s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                total+=900;
                i += 1;
                continue;
            }
            val = getRomanvalue(s.charAt(i));
            c= 1;
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                c++;
                i++;
            }
            val *= c;
            total += val;
        
        }
    return total;
    }
}