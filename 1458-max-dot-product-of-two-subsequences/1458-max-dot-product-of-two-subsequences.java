class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        
        // dp[i][j] stores the max dot product using nums1[0...i-1] and nums2[0...j-1]
        int[][] dp = new int[n + 1][m + 1];
        
        // Initialize with a very small value to handle negative products
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = -1000000000; // Effectively negative infinity
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int currentProduct = nums1[i-1] * nums2[j-1];
                
                /* We take the maximum of:
                   1. The current product alone (starts a new subsequence)
                   2. currentProduct + best from previous elements (extends a subsequence)
                   3. The best result without using nums1[i-1]
                   4. The best result without using nums2[j-1]
                */
                dp[i][j] = Math.max(currentProduct, currentProduct + dp[i-1][j-1]);
                dp[i][j] = Math.max(dp[i][j], Math.max(dp[i-1][j], dp[i][j-1]));
            }
        }
        
        return dp[n][m];
    }
}