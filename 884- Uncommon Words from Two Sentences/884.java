class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        String [] wordsA = A.split("\\s+");
        String [] wordsB = B.split("\\s+");
        ArrayList<String> fin = new ArrayList<String>();
        HashMap <String,Integer> set1 = new HashMap<String,Integer>();
        for(int i = 0; i < wordsA.length; i++){
                set1.put(wordsA[i], set1.getOrDefault(wordsA[i], 0) + 1);
        }
        for(int i = 0; i < wordsB.length; i++){
                set1.put(wordsB[i], set1.getOrDefault(wordsB[i], 0) + 1);
        }
        
        for(Map.Entry entry:set1.entrySet()){
            if((Integer)entry.getValue() == 1)
                fin.add((String)entry.getKey());
        }
        String[] final_arr = new String[fin.size()];
        return fin.toArray(final_arr);
    }
}