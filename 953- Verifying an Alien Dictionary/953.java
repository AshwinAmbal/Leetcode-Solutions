class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap <Character, Integer> ord = new HashMap <Character, Integer>();
        int i = 0, flag = 0;
        for(char ch : order.toCharArray()){
            ord.put(ch, i++);
        }
        for(i = 0; i < words.length - 1; i++){
            if(words[i].length() > words[i+1].length())
                flag = 1;
            for(int j = 0; j < words[i].length() && j < words[i+1].length() ; j++){
                if((Integer) ord.get(words[i].charAt(j)) < (Integer) ord.get(words[i+1].charAt(j))){
                    flag = 0;
                    break;
                }
                else if((Integer) ord.get(words[i].charAt(j)) > (Integer) ord.get(words[i+1].charAt(j)))
                    return false;
            }
            if(flag == 1)
                return false;
        }
        return true;
    }
}