class Solution {
    public void setZeroes(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // Check first row
        for(int j = 0; j < col; j++) {
            if(matrix[0][j] == 0) {
                firstRow = true;
            }
        }

        // Check first column
        for(int i = 0; i < row; i++) {
            if(matrix[i][0] == 0) {
                firstCol = true;
            }
        }

        // Mark rows and columns using first row/column
        for(int i = 1; i < row; i++) {
            for(int j = 1; j < col; j++) {

                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set marked rows to zero
        for(int i = 1; i < row; i++) {
            if(matrix[i][0] == 0) {

                for(int j = 1; j < col; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set marked columns to zero
        for(int j = 1; j < col; j++) {
            if(matrix[0][j] == 0) {

                for(int i = 1; i < row; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // First row
        if(firstRow) {
            for(int j = 0; j < col; j++) {
                matrix[0][j] = 0;
            }
        }

        // First column
        if(firstCol) {
            for(int i = 0; i < row; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}