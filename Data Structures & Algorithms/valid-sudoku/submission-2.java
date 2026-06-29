class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int i = 0; i < 9; i++) {

            HashSet<Character> colSet = new HashSet<>();
            HashSet<Character> rowSet = new HashSet<>();
            HashSet<Character> boxSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                
                if (board[i][j] != '.' && !rowSet.add(board[i][j])) {
                    return false;
                }

                if (board[j][i] != '.' && !colSet.add(board[j][i])) {
                    return false;
                }

                int r = 3 * (i / 3) + (j / 3);
                int c = 3 * (i % 3) + (j % 3);
                if (board[r][c] != '.' && !boxSet.add(board[r][c])) {
                    return false;
                }

            }
            
        }

        return true;
    }
}
