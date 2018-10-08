class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0)
            return m * n;
        int count1 = ops[0][0], count2 = ops[0][1];
        for(int i = 1; i < ops.length; i++){
            if(count1 > ops[i][0])
                count1 = ops[i][0];
            if(count2 > ops[i][1])
                count2 = ops[i][1];
        }
        return count1 * count2;
    }
}