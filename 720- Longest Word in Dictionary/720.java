class Solution {
    public String longestWord(String[] words) {
        int maxLen = 0;
        ArrayList<String> result = new ArrayList<String>();
        HashMap <Integer, HashSet<String>> length = new HashMap <Integer, HashSet<String>>();
        for(String str : words){
            if(length.get(str.length()) == null)
                length.put(str.length(), new HashSet<String>());
            length.get(str.length()).add(str);
            maxLen = Math.max(maxLen, str.length());
        }
        int flag = 1, mainFlag = 0;
        while(maxLen >= 0){
            HashSet <String> temp = (HashSet) length.get(maxLen);
            if(temp == null){
                maxLen--;
                continue;
            }
            for(String str : temp){
                flag = 1;
                for(int i = maxLen - 1; i >= 1; i--){
                    HashSet <String> temporary = (HashSet)length.get(i);
                    if(temporary == null || !temporary.contains(str.substring(0, i))){
                        flag = 0;
                        break;
                    }
                }
                if(flag == 1){
                    mainFlag = 1;
                    result.add(str);
                }
            }
            if(mainFlag == 0)
                maxLen--;
            else
                break;
        }
        if(result.isEmpty())
            return "";
        String res = result.get(0);
        for(String s: result){
            if(res.compareTo(s) > 0)
                res = s;
        }
        return res;
    }
}