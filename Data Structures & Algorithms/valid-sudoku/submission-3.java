class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int i = 0; i < 9; i++) {

            boolean[] colSet = new boolean[9];
            boolean[] rowSet = new boolean[9];
            boolean[] boxSet = new boolean[9];

            for (int j = 0; j < 9; j++) {
                
                if (board[i][j] != '.') {
                    char c = board[i][j];
                    if (!rowSet[c - '1']) rowSet[c - '1'] = true;
                    else return false;
                }

                if (board[j][i] != '.') {
                    char c = board[j][i];
                    if (!colSet[c - '1']) colSet[c - '1'] = true;
                    else return false;
                }

                int r = 3 * (i / 3) + (j / 3);
                int c = 3 * (i % 3) + (j % 3);
                if (board[r][c] != '.') {
                    char ch = board[r][c];
                    if (!boxSet[ch - '1']) boxSet[ch - '1'] = true;
                    else return false;
                }
            }
            
        }

        return true;
    }
}
