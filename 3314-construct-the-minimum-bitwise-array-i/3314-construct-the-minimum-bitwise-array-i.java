class Solution {
    public static int findx(int n){
        if(n==2){
            return -1;
        }
        int leftmost=(n+1) & -(n+1);
        int result=n^(leftmost>>1);
        return result;
    }
    public int[] minBitwiseArray(List<Integer> nums) {
        int len=nums.size();
        int[] array=new int[len];
        for(int i=0;i<len;i++){
            array[i]=findx(nums.get(i));
        }
        return array;
    }
}