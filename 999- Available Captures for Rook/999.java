class Solution {
    public int numRookCaptures(char[][] board) {
        int i = 0, j = 0, count = 0, found = 0;
        for(i = 0; i < board.length; i++){
            for(j = 0; j < board[0].length; j++)
                if(board[i][j] == 'R'){
                    found = 1;
                    break;
                }
            if(found == 1)
                break;
        }
        int right = j, left = j, top = i, bottom = i;
        while(right < board[0].length){
            if(board[i][right] == 'B')
                break;
            else if(board[i][right] == 'p'){
                count++;
                break;
            }
            right++;
        }
        while(left >= 0){
            if(board[i][left] == 'B')
                break;
            else if(board[i][left] == 'p'){
                count++;
                break;
            }
            left--;
        }
        while(top >= 0){
            if(board[top][j] == 'B')
                break;
            else if(board[top][j] == 'p'){
                count++;
                break;
            }
            top--;
        }
        while(bottom < board.length){
            if(board[bottom][j] == 'B')
                break;
            else if(board[bottom][j] == 'p'){
                count++;
                break;
            }
            bottom++;
        }
        return count;
    }
}