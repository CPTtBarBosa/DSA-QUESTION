class Solution {
    public int minimumDifference(int[] nums, int k) {
       if (k == 1) return 0;

        // Step 1: Sort the scores
        Arrays.sort(nums);

        int minDiff = Integer.MAX_VALUE;

        // Step 2: Slide the window of size k
        // The window starts at i and ends at i + k - 1
        for (int i = 0; i <= nums.length - k; i++) {
            int currentDiff = nums[i + k - 1] - nums[i];
            
            // Step 3: Update the overall minimum
            minDiff = Math.min(minDiff, currentDiff);
        }

        return minDiff;
    }
}