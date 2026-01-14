class Solution {
    public int findMin(int[] nums) {
        int minrigth=Integer.MAX_VALUE;
        int rigth=nums.length-1;
        int left=0;
        while(left<=rigth){
           int min1=nums[left];
            minrigth=Math.min(min1,minrigth);
            left++;
            

        }
        return minrigth;
    }
}