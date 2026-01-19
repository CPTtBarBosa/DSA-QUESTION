class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
     int count=0;
     int maxcount=0;
    //  if(nums.length ==1  && nums[0]==1){
    //     return count;
    //  }
     
     for(int i=0;i<nums.length;i++){
        if(nums[i] ==1){
            count++;
        }
        else{
            count=0;
        }
        maxcount=Math.max(count,maxcount);
     }
     return maxcount;
     
            
        
        
    }
}