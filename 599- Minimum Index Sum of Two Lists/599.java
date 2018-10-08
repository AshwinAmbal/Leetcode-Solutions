class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap <String, Integer> rankCount1 = new HashMap<String, Integer>();
        HashMap <String, Integer> rankCount2 = new HashMap<String, Integer>();
        int max = Integer.MIN_VALUE;
        List <String> pref = new ArrayList<String>();        
        
        for(int i = 0; i < list1.length; i++){
            String item = list1[i];
            if(rankCount1.get(item) != null)
                rankCount1.put(item, rankCount1.get(item) + list1.length - i);
            else
                rankCount1.put(item,list1.length - i);
        }
        
        for(int i = 0; i < list2.length; i++){
            String item = list2[i];
            if(rankCount2.get(item) != null)
                rankCount2.put(item, rankCount2.get(item) + list2.length - i);
            else
                rankCount2.put(item,list2.length - i);
        }

        for(Map.Entry <String, Integer> entry: rankCount1.entrySet()){
            if(rankCount2.get(entry.getKey()) != null)
                max = Math.max(max, entry.getValue() + rankCount2.get(entry.getKey()));
        }
        
        for(Map.Entry <String, Integer> entry: rankCount1.entrySet()){
            if(rankCount2.get(entry.getKey()) != null && max - rankCount2.get(entry.getKey()) == entry.getValue())
                pref.add(entry.getKey());
        }
        return pref.toArray(new String[0]);
    }
}