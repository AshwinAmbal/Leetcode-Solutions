class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int pIndex = 0, temp;
        while(pIndex < A.length && A[pIndex] % 2 == 0)
            pIndex += 2;
        if(pIndex >= A.length)
            return A;
        for(int i = 1; i < A.length && pIndex < A.length; i += 2){
            if(A[i] % 2 == 0){
                temp = A[i];
                A[i] = A[pIndex];
                A[pIndex] = temp;
                while(pIndex < A.length && A[pIndex] % 2 == 0)
                    pIndex += 2;
            }
        }
        return A;
    }
}