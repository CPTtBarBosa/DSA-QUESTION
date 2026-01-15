class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;
        
        // Traverse through the points starting from the second point
        for (int i = 0; i < points.length - 1; i++) {
            int[] current = points[i];
            int[] next = points[i + 1];
            
            // Calculate the distance for x and y
            int diffX = Math.abs(next[0] - current[0]);
            int diffY = Math.abs(next[1] - current[1]);
            
            // The time taken is the maximum of the two differences
            totalTime += Math.max(diffX, diffY);
        }
        
        return totalTime;
    }
}