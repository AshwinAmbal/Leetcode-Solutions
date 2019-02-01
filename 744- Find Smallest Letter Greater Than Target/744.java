class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int first = 0, last = letters.length - 1, mid = -1;
        while(first <= last){
            mid = first + (last - first)/2;
            if(letters[mid] == target)
                break;
            else if(letters[mid] < target)
                first = mid + 1;
            else
                last = mid - 1;
        }
        while(letters[mid] <= target){
            mid = (mid+1) % letters.length;
            if(mid == 0)
                break;
        }
        return letters[mid];
    }
}