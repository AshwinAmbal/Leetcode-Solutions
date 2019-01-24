class Solution {
    public int[] fairCandySwap(int[] A, int[] B) {
        int [] ans = {0, 0};
        int s1 = 0, s2 = 0;
        HashSet <Integer> set = new HashSet<Integer>();
        for(int i = 0; i < A.length; i++)
            s1 += A[i];
        for(int i = 0; i < B.length; i++){
            s2 += B[i];
            set.add(B[i]);
        }
        int res = (s2 - s1) / 2;
        for(int i = 0; i < A.length; i++){
            if(set.contains(A[i] + res)){
                ans[0] = A[i];
                ans[1] = A[i] + res;
                break;
            }
        }
        return ans;
    }
}