class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2*n];
        int [] n1=new int[n];
        for(int i=0;i<n;i++){
            n1[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        for(int j=0;j<n1.length;j++){
            ans[j+n]=n1[j];
        }
        return ans;

    }
}