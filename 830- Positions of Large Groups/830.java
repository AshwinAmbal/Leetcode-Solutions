class Solution {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        char cur = '\0';
        for(int i = 0; i < S.length(); i++){
            List<Integer> temp = new ArrayList<Integer>();
            int count = 0, start = i, end = -1;
            cur = S.charAt(i);
            while(i < S.length() && S.charAt(i) == cur){
                i++;
                count++;
            }
            end = i-1;
            if(count >= 3){
                temp.add(start);
                temp.add(end);
                res.add(temp);
            }
            i -= 1;
        }
        return res;
    }
}