class Solution {
    public int maxProduct(int[] nums) {
        int minend=nums[0];
        int maxend=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=nums[i];
            int v2=nums[i]*minend;
            int v3=nums[i]*maxend;
            maxend=Math.max(v1,Math.max(v2,v3));
            minend=Math.min(v1,Math.min(v2,v3));
            ans=Math.max(ans,Math.max(minend,maxend));
        }
        return ans;
            }
}