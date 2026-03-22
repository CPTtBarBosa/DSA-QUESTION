class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
       int n = mat.length;
        
        // Check for 4 possible rotations (0, 90, 180, 270 degrees)
        for (int i = 0; i < 4; i++) {
            if (checkEqual(mat, target)) {
                return true;
            }
            rotateMatrix(mat);
        }
        
        return false;
    }
    
    // Helper method to check if two matrices are identical
    private boolean checkEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    
    // Helper method to rotate the matrix 90 degrees clockwise in-place
    private void rotateMatrix(int[][] mat) {
        int n = mat.length;
        
        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }
}