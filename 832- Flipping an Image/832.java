class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int j, k, i;
        for(i = 0; i < A.length; i++){
            for(j = 0, k = A[i].length-1; j < A[i].length / 2; k--, j++){
                A[i][j] = (A[i][j] == 0) ?  1 : 0;
                A[i][k] = (A[i][k] == 0) ? 1 : 0;
                int temp = A[i][j];
                A[i][j] = A[i][k];
                A[i][k] = temp;
            }
            if(A[i].length % 2 != 0){
                 A[i][j] = (A[i][j] == 0) ? 1 : 0;
            }
        }
    return A;
    }
}