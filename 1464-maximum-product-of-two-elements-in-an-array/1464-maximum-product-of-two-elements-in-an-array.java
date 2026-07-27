class Solution {
    public int maxProduct(int[] nums) {
        int product=1;
        Arrays.sort(nums);
        product*=(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        return product;

    }
}