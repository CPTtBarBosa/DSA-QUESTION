class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        boolean startindex;
        int start=search( nums,target,startindex=true);
        int last=search(nums,target,startindex=false);
        ans[0]=start;
        ans[1]=last;
        return ans;
        
    }
    public int search(int[] nums,int target,boolean startindex){
        int start =0;
        int end=nums.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                ans=mid;
                if(startindex==true){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}