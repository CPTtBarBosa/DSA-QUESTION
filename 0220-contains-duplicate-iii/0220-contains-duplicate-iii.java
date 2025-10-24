class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
      TreeSet<Long> window=new TreeSet<>();
      for(int i=0;i<nums.length;i++){
        long num=nums[i];
        Long flor=window.ceiling(num-valueDiff);
        if (flor != null && flor <= num+valueDiff){
            return true;
        }
        window.add(num);
         if (i >= indexDiff) {
                window.remove((long) nums[i - indexDiff]);
            }
      }
      return false;
    }
}