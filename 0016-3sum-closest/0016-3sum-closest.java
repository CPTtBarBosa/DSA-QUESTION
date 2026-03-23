class Solution {
    public int threeSumClosest(int[] nums, int target) {
     int len=nums.length;
     int sum=0;
     int near=nums[0]+nums[1]+nums[2];
     Arrays.sort(nums);
     for(int i=0;i<len;i++){
        if(i>0 && nums[i]==nums[i-1]){// skip duplicate values
            continue;
        }
        int l=i+1;
        int r=len-1;
        while(l<r){
            sum=nums[i]+nums[l]+nums[r];
            if (Math.abs(target - sum) < Math.abs(target - near)) {
                    near = sum;
                }

                if (sum == target) return target;
                else if (sum < target) l++;
                else r--;
            }
        }
     
     return near;   
    }
}