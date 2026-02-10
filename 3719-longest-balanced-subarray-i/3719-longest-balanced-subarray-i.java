class Solution {
    public int longestBalanced(int[] nums) {
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> distinctEvens = new HashSet<>();
            HashSet<Integer> distinctOdds = new HashSet<>();

            for (int j = i; j < nums.length; j++) {
                if (nums[j] % 2 == 0) {
                    distinctEvens.add(nums[j]);
                } else {
                    distinctOdds.add(nums[j]);
                }

                // If number of distinct evens equals distinct odds
                if (distinctEvens.size() == distinctOdds.size()) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }
}