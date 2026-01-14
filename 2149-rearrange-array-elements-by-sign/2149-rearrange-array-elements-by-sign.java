class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] re=new int[nums.length];
        int postive=0;
        int negative=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                re[negative]=nums[i];
                negative+=2;
            }
            else{
                re[postive]=nums[i];
                postive+=2;
            }
        }
        return re;
    }
}