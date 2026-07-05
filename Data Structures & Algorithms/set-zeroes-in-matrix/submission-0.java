class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for(int i=0; i<m; i++) {
            if(rows[i]) {
                setRowZero(i, matrix, n);
            }
        }

        for(int j=0; j<n; j++) {
            if(cols[j]) {
                setColZero(j, matrix, m);
            }
        }
    }

    private void setRowZero(int row, int[][] matrix, int n) {
        for(int j=0; j<n; j++) {
            matrix[row][j] = 0;
        }
    }

    private void setColZero(int col, int[][] matrix, int m) {
        for(int i=0; i<m; i++) {
            matrix[i][col] = 0;
        }
    }
}