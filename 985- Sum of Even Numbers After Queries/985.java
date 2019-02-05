class Solution {
    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = 0;
        int [] res = new int[queries.length];
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0)
                sum += A[i];
        }
        for(int i = 0; i < queries.length; i++){
            int val = queries[i][0], index = queries[i][1];
            if((A[index] + val) % 2 == 0){
                if(A[index] % 2 != 0)
                    sum += val + A[index];
                else
                    sum += val;
            }
            else{
                if(A[index] % 2 == 0)
                    sum -= A[index];
            }
            A[index] += val;
            res[i] = sum;
        }
        return res;
    }
}