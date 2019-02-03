class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[!?',;.]", " ");
        String [] para = paragraph.split("\\s+");
        HashSet <String> ban = new HashSet<String>(Arrays.asList(banned));
        HashMap <String, Integer> count = new HashMap <String, Integer>();
        for(String str : para){
            count.put(str, count.getOrDefault(str, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        String result = "";
        for(Map.Entry entry : count.entrySet()){
            if((Integer) entry.getValue() > max && !ban.contains((String)entry.getKey())){
                max = (Integer) entry.getValue();
                result = (String) entry.getKey();
            }
        }
        return result;
    }
}