class Solution {
    public int singleNumber(int[] nums) {
        int singleno=0;
        for(int i=0;i<nums.length;i++){
            singleno^=nums[i];
        }
        return singleno;
    }
}