class Solution {
    public int minPairSum(int[] nums) {
        int left=0;
        int rigth=nums.length-1;
        Arrays.sort(nums);
        int sum=0;
        int maxsum=0;
        while(left<rigth){
            sum=nums[left]+nums[rigth];
            maxsum=Math.max(maxsum,sum);
            left++;
            rigth--;
        }
        return maxsum;

    }
}