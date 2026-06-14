class Solution {
    public int[] leftRightDifference(int[] nums) {
          int rigthsum=0;
        int[] leftsum1=new int[nums.length];
        int[] rightsum1=new int[nums.length];
        int[] sumdiff=new int[nums.length];

        int totalsum=0;
        leftsum1[0]=0;
        for(int i=1;i<nums.length;i++){
            leftsum1[i]+=nums[i-1]+leftsum1[i-1];
        }


        
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }

        for(int i=0;i<nums.length;i++){
             totalsum=totalsum-nums[i];
             rightsum1[i]=totalsum;
        }
        for(int i=0;i< nums.length;i++){
            int diff=Math.abs(leftsum1[i]-rightsum1[i]);
            sumdiff[i]=diff;

        }
        return sumdiff;
    }
}