class Solution {
    public int missingNumber(int[] nums) {
        int mising_number=0;
        int sumofranges=0;
        for(int i=0;i<=nums.length;i++){
            sumofranges+=i;
        }
        int suminarray=0;
        for(int j=0;j<nums.length;j++){
            suminarray+=nums[j];
        }
        mising_number=sumofranges-suminarray;
        return mising_number;
    }
}