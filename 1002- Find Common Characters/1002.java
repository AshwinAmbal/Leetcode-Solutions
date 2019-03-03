class Solution {
    public List<String> commonChars(String[] A) {
        int [] countAll = new int[26];
        int [] countdups = new int[26];
        int len = A.length, firstTime = 0;
        List<String> res = new ArrayList<String>();        
        Arrays.fill(countAll, len);
        
        for(int num = 0; num < len; num++){
            int [] count = new int[26];
            String str = A[num];
            for(int i = 0; i < str.length(); i++){
                if(countAll[str.charAt(i) - 'a'] == len - num){
                    countAll[str.charAt(i) - 'a']--;
                    count[str.charAt(i) - 'a']++;
                }
                else if(countAll[str.charAt(i) - 'a'] < len - num){
                    count[str.charAt(i) - 'a']++;
                }
            }
            if(firstTime == 0){
                countdups = count.clone();
                firstTime = 1;
            }
            else{
                for(int i = 0; i < 26; i++){
                    if(countdups[i] > count[i])
                        countdups[i] = count[i];
                }
            }
        }
        
        for(int i = 0; i < 26; i++){
            if(countAll[i] == 0){
                while(countdups[i] > 0){
                    res.add(Character.toString((char) ('a' + i)));
                    countdups[i]--;
                }
            }
        }
        return res;
    }
}