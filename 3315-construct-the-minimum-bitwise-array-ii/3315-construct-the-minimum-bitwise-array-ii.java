class Solution {
    public static int finx(int x){
        if(x==2){
            return -1;
        }
        int len=(x+1)&-(x+1);
        int result=x^(len>>1);
        return result;
    }
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] minbit=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            minbit[i]=finx(nums.get(i));
        }
        return minbit;

    } 
}