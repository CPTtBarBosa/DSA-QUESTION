class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, int[]> lastIndices = new HashMap<>();
        int minDistance = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            
            if (!lastIndices.containsKey(val)) {
                // First time seeing this number, store current index
                lastIndices.put(val, new int[]{-1, i});
            } else {
                int[] indices = lastIndices.get(val);
                
                // If we have at least two previous indices, we found a "good" tuple
                if (indices[0] != -1) {
                    int first = indices[0];
                    // The distance is 2 * (current_index - first_index)
                    minDistance = Math.min(minDistance, 2 * (i - first));
                    found = true;
                }
                
                // Shift indices: the old 'prev1' becomes 'prev2', and current 'i' becomes 'prev1'
                indices[0] = indices[1];
                indices[1] = i;
            }
        }

        return found ? minDistance : -1;
        
    }
}