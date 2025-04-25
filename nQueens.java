class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result= new ArrayList<>();
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        solve(board,result,0);
        return result;
    }
    private void solve(char board[][], List<List<String>> result, int row){
        if(row== board.length){
            result.add(construct(board));
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                solve(board, result, row+1);
                board[row][j]='.';
            }
        }
    }
    private boolean isSafe(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        return true;
    }

    private List<String> construct(char board[][]){
        List<String> res= new ArrayList<>();
        for(char[] row: board){
            res.add(new String(row));
        }
        return res;
    }



}
