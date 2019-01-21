class Solution {
    public int[] sortedSquares(int[] A) {
        int []B = new int[A.length];
        int last = A.length - 1, first = 0, k = last;
        
        while(first <= last){
            B[k--] = (Math.abs(A[last]) > Math.abs(A[first])) ? (int) Math.pow(A[last--], 2) : (int) Math.pow(A[first++], 2);
        }
        return B;
    }
}