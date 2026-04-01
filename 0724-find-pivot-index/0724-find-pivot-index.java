class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int left=0;
        int right=0;
        int pivotindex=-1;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum==nums[0]){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            
            right=sum-nums[i]-left;
            if(right==left){
                pivotindex=i;
                break;
            }
            left+=nums[i];
        }
        return pivotindex;

    }
}