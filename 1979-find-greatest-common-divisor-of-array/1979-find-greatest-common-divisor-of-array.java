class Solution {
    public static int gcd(int a,int b){
        if(b==0){
            return Math.abs(a);
        }
        return gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        int ans=gcd(max,min);
        return ans;
    }
}