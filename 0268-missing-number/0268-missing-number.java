class Solution {
    public int missingNumber(int[] nums) {
        int totalsum=0;
        int curentsum=0;
        int len=nums.length;
        int missingnumber=0;
        for(int i=0;i<len+1;i++){
            totalsum=totalsum+i;
            
        }
        for(int j=0;j<len;j++){
            curentsum=curentsum+nums[j];
        }
        missingnumber=totalsum-curentsum;
        return missingnumber;
    }
}