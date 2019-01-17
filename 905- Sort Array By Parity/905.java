class Solution {
    public int[] sortArrayByParity(int[] A) {
        int pIndex = 0;
        int temp;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                temp = A[pIndex];
                A[pIndex] = A[i];
                A[i] = temp;
                pIndex++;
            }
        }
        return A;
    }
}