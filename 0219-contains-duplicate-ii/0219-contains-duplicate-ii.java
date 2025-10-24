class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
            boolean ans=false;
            HashSet<Integer> map=new HashSet<>();
            for(int i=0;i<nums.length;i++){
                if(map.contains(nums[i])){
                    ans=true;
                }
                map.add(nums[i]);
                if(map.size()>k){
                    map.remove(nums[i-k]);
                }
            }
            return ans;

        
    }
}