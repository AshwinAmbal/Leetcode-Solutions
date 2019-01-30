class Solution {
    public int[][] imageSmoother(int[][] M) {
        int [][] res = new int [M.length][M[0].length];
        for(int i = 0; i < M.length; i++){
            for(int j = 0; j < M[0].length; j++){
                float count = 0, sum = 0;
                int x = i, y = j, flagxt = 0, flagxb = 0, flagyl = 0, flagyr = 0;
                sum += M[x][y];
                count++;
                if(x > 0){
                    sum += M[x-1][y];
                    count++;
                    flagxt = 1;
                }
                if(y > 0){
                    sum += M[x][y-1];
                    count++;
                    flagyl = 1;
                }
                if(x < M.length - 1){
                    sum += M[x+1][y];
                    count++;
                    flagxb = 1;
                }
                if(y < M[0].length - 1){
                    sum += M[x][y+1];
                    count++;
                    flagyr = 1;
                }
                if(flagxt == 1 && flagyl == 1){
                    sum += M[x-1][y-1];
                    count++;
                }
                if(flagxb == 1 && flagyr == 1){
                    sum += M[x+1][y+1];
                    count++;
                }
                if(flagxt == 1 && flagyr == 1){
                    sum += M[x-1][y+1];
                    count++;
                }
                if(flagxb == 1 && flagyl == 1){
                    sum += M[x+1][y-1];
                    count++;
                }
                res[x][y] = (int) Math.floor(sum/count);
            }
        }
        return res;
    }
}