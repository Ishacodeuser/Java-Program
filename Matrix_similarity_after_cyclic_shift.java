class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;

        int shift = k % n; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int originalCol;
                if (i % 2 == 0) {
                    originalCol = (j + shift) % n;
                } else {
                    originalCol = (j - shift + n) % n;
                }
                if (mat[i][j] != mat[i][originalCol]) {
                    return false;
                }
            }
        }
        return true;
    }
}