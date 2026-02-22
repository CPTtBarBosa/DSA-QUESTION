class Solution {
    public int binaryGap(int n) {
      int maxDistance = 0;
        int lastPosition = -1; // To track the index of the previous '1'
        int currentPosition = 0;

        while (n > 0) {
            // Check if the current bit is 1
            if ((n & 1) == 1) {
                // If this isn't the first '1' we've seen, calculate distance
                if (lastPosition != -1) {
                    maxDistance = Math.max(maxDistance, currentPosition - lastPosition);
                }
                // Update lastPosition to the current index
                lastPosition = currentPosition;
            }
            
            // Shift n to the right by 1 to check the next bit
            n >>= 1;
            currentPosition++;
        }

        return maxDistance;  
    }
}