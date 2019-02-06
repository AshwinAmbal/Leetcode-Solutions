class Solution {
    public boolean validMountainArray(int[] A) {
        int i = 0, flag = 0;
        for(i = 0; i < A.length - 1; i++){
            if(A[i] < A[i+1])
                flag = 1;
            if(A[i] >= A[i+1]){
                break;
            }
        }
        if(flag == 0)
            return false;
        flag = 0;
        for(; i < A.length - 1; i++){
            if(A[i] > A[i+1])
                flag = 1;
            if(A[i] <= A[i+1])
                return false;
        }
        if(flag == 0)
            return false;
        return true;
    }
}