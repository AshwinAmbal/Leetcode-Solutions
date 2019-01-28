class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int [] count = new int[26];
        char ch;
        for(int i = 0; i < licensePlate.length(); i++){
            if(!Character.isDigit(licensePlate.charAt(i)) && licensePlate.charAt(i) != ' '){
                ch = Character.toLowerCase(licensePlate.charAt(i));
                count[ch - 'a'] += 1;
            }
        }
        int minLength = Integer.MAX_VALUE;
        String str = "";
        for(int i = 0; i < words.length; i++){
            int [] count_temp = count.clone();
            for(int j = 0; j < words[i].length(); j++){
                    count_temp[words[i].charAt(j) - 'a'] -= 1;
            }
            int flag = 0;
            for(int j = 0; j < count_temp.length; j++){
                if(count_temp[j] > 0){
                    flag = 1;
                    //System.out.print(words[i]);
                    break;
                }
            }
            if(flag == 0 && minLength > words[i].length()){
                System.out.print(words[i]);    
                str = words[i];
                minLength = str.length();
            }
        }
        return str;
    }
}