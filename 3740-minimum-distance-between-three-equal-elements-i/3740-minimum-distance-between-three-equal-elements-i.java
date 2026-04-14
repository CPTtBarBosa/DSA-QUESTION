class Solution {
    public int minimumDistance(int[] nums) {
        int minimumabs=Integer.MAX_VALUE;
       
        int abs=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        abs=2*(k-i);
                        minimumabs=Math.min(abs,minimumabs);
                    }
                }
            }
        }
        return (minimumabs==Integer.MAX_VALUE)? -1:minimumabs;
    }
}