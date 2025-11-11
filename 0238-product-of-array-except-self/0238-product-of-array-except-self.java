class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] arr=new int[len];
        Arrays.fill(arr,1);
        int leftproduct=1;
        int rigthproduct=1;
        for(int  i=0;i<len;i++){
            arr[i]=leftproduct;
            leftproduct=nums[i]*leftproduct;
        }
        for(int j=len-1;j>=0;j--){
            arr[j]=arr[j]*rigthproduct;
            rigthproduct=rigthproduct*nums[j];
        }
        return arr;
       

    }
}