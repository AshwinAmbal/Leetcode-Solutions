class Solution {
    public int countSegments(String s) {
        if(s.equals(""))
            return 0;
        ArrayList seg = new ArrayList(Arrays.asList(s.split("\\s+")));
        seg.remove("");
        return seg.size();
    }
}