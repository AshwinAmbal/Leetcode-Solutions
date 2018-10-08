class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int orow = nums.length, ocol = nums[0].length;
        if(orow * ocol != r * c)
            return nums;
        int [][] new_nums = new int[r][c];
        int row_num = 0, col_num = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                new_nums[i][j] = nums[row_num % orow][col_num++ % ocol];
                if(col_num % ocol == 0)
                    row_num++;
            }
        }
        return new_nums;
    }
}