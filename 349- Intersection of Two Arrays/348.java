class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet <Integer>();
        HashSet <Integer> result = new HashSet<Integer>();
        int k = 0;
        for(int i = 0; i < nums1.length; i++)
            set.add(nums1[i]);
        for(int i = 0; i < nums2.length; i++)
            if(set.contains(nums2[i]))
                result.add(nums2[i]);
        int [] final_result = new int[result.size()];
        for(int i : result)
            final_result[k++] = i;
        return final_result;
    }
}