class Solution {
    public static void reverse(int[] array,int left,int rigth){
        
        while(left<rigth){
            int temp=array[left];
            array[left]=array[rigth];
            array[rigth]=temp;
            left++;
            rigth--;
        }
    }
    public void rotate(int[] nums, int k) {
     int len=nums.length;
     k=k%len;
     reverse(nums,0,len-1);
     reverse(nums,0,k-1);
     reverse(nums,k,len-1);
     
        
    }
}