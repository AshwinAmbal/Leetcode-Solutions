class Solution {
    public List<Integer> getRow(int rowIndex) {
        int left = 0, right = 0, i = 1;
        List<List<Integer>> collection = new ArrayList<List<Integer>>();
        Integer[] coll;
        while(left <= right && i <= rowIndex+1){
            coll = new Integer[i];
            if(i == 1){
                coll[left] = 1;
                collection.add(Arrays.asList(coll));
                i++;
                right++;
                continue;
            }
            coll[left] = 1;
            coll[right] = 1;
            for(int c = 1; c <= i-2; c++){
                //System.out.print(collection.get(i-2));
                coll[c] = collection.get(i-2).get(c-1) + collection.get(i-2).get(c);
            }
            collection.add(Arrays.asList(coll));
            i++;
            right++;
        }
        return collection.get(rowIndex);
    }
}