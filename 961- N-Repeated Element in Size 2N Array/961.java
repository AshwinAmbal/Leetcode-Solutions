class Solution {
    public int repeatedNTimes(int[] A) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 0; i < A.length; i++){
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            if(map.get(A[i]) == A.length/2)
                return A[i];
        }
        return 0;
    }
}