class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> map1 = new HashMap<>();
        HashMap <Integer, Integer> map2 = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int [] final_result;
        int k = 0;
        
        for(int i = 0; i < nums1.length; i++)
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        
        for(int i = 0; i < nums2.length; i++)
            map2.put(nums2[i], map2.getOrDefault(nums2[i], 0) + 1);
        
        for(Map.Entry<Integer,Integer> entry: map1.entrySet())
            for(int i = 0; i < Math.min(map2.getOrDefault(entry.getKey(), 0), entry.getValue()); i++)
                result.add(entry.getKey());
        
        final_result = new int[result.size()];
        for(int i = 0; i < result.size(); i++)
            final_result[k++] = result.get(i);
        
        return final_result;
    }
}