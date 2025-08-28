class Solution {
    public int maxSubArray(int[] nums) {
       int len=nums.length;
            int cur=0;
        int max=nums[0];
        for(int i=0;i<len;i++){
            cur=cur+nums[i];
            max=Math.max(cur,max);
            if(cur<0){
                cur=0;
            }
        }
        return max;
        
    }
}