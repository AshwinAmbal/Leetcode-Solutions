class Solution {
    public int peakIndexInMountainArray(int[] A) {
        if(A.length <= 2)
            return -1;
        int first = 0, last = A.length - 1, mid;
        while(first <= last){
            mid = first + (last - first) / 2;
            if(A[mid - 1] < A[mid] && A[mid] > A[mid + 1])
                return mid;
            else if(A[mid - 1] < A[mid])
                first = mid + 1;
            else
                last = mid - 1;
        }
    return -1;
    }
}