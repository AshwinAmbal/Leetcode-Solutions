class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        List <String>final_list = new ArrayList<String>();
        int flag, flag1, flag2;
        for(String word: words){
            flag1 = flag2 = flag = -1;
            for(int i = 0; i < word.length();i++){
                if(row1.indexOf(Character.toLowerCase(word.charAt(i))) != -1)
                    flag1 = 1;
                else if(row2.indexOf(Character.toLowerCase(word.charAt(i)))!= -1)
                    flag1 = 2;
                else
                    flag1 = 3;
                if(i != 0 && flag1 != flag2){
                    flag = 1;   
                    break;
                }
                flag2 = flag1;
            }
            if(flag == -1){
                final_list.add(word);
            }
        }
        return final_list.toArray(new String[final_list.size()]);
    }
}