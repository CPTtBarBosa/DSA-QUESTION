class Solution {
    public int searchInsert(int[] nums, int target) {
    int indexpostion=nums.length;
    int left=0;
    int rigth=nums.length-1;
    while(left<=rigth){
        int mid=(left+rigth)/2;
        if(nums[mid]>=target){
            indexpostion=mid;
            rigth=mid-1;
        }
        else{
            left=mid+1;
        }
    }
    return indexpostion;
    }
}