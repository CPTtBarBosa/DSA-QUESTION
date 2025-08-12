class Solution {
    public int majorityElement(int[] nums) {
        int len=nums.length;
        int n=len/2;
        int major=nums[0];
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<len;i++){
            s.put(nums[i],s.getOrDefault(nums[i],0)+1);
            if(s.get(nums[i])>n){
               major=nums[i];
            }
        }
        return major;
    }
}