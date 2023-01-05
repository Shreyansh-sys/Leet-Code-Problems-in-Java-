class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(board[row][col]!='.' && !isValidPlacement(board, board[row][col], row, col))
                return false;
            }
        }
        return true;
    }

    boolean isValidPlacement(char [][] board, char num, int row, int col){
        return !isNumberInRow(board, board[row][col], row, col) && !isNumberInColumn(board, board[row][col], row, col) && !isNumberInBox(board, board[row][col], row, col);
    }

    boolean isNumberInRow(char [][] board, char num, int row, int col){
        for(int i=0; i<9;i++){
            if(col!=i && board[row][i]==num) return true;
        }
        return false;
    }

    boolean isNumberInColumn(char [][] board, char num, int row, int col){
        for(int i=0; i<9;i++){
            if(row!=i && board[i][col]==num) return true;
        }
        return false;
    }

    boolean isNumberInBox(char [][] board, char num, int row, int col){
        int boxRow = row - row%3;
        int boxCol = col - col%3;

        for(int i=boxRow;i<boxRow+3;i++){
            for(int j=boxCol;j<boxCol+3;j++){
                if(row!=i && col!=j && board[i][j]==num) return true;
            }
        }
        return false;
    }

}