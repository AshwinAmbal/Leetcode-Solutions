class Solution {
    public int repeatedStringMatch(String A, String B) {
        int lengthB = B.length(), lengthA = A.length();
        if(A.contains(B))
            return 1;
        StringBuilder str = new StringBuilder(A);
        int count = 1;
        for(int i = 0; i < lengthB; i += lengthA){
            str.append(A);
            count++;
            if(str.length() >= lengthB && str.toString().indexOf(B) != -1)
                return count;
        }
        return -1;
    }
}