class Solution {
    public boolean isMonotonic(int[] A) {
        boolean flag1 = false, flag2 = false;
        for(int i = 1; i < A.length; i++){
            if(A[i-1] < A[i])
                flag1 = true;
            else if(A[i-1] > A[i])
                flag2 = true;
            if(A[i-1] > A[i] && flag1)
                return false;
            else if(A[i-1] < A[i] && flag2)
                return false;
        }
        return true;
    }
}