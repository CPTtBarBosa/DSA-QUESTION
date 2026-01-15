class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        
        // 2. Concatenate s with itself.
        String total = s + s;
        
        // 3. If goal is a substring of (s + s), then goal is a rotation of s.
        return total.contains(goal);
    }
}