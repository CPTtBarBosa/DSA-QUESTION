class Solution {
    public int maximumProduct(int[] nums) {
        int product=1;
        Arrays.sort(nums);
         int product1=nums[0]*nums[1]*nums[nums.length-1];
        int  product2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int maxproduct=Math.max(product1,product2);
        return maxproduct;
    }
}