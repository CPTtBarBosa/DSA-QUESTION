class Solution {
    public int trap(int[] height) {
        int left=0;
        int rigth=height.length-1;
        int maxleft=height[left];
        int maxrigth=height[rigth];
        int result=0;
        while(left<rigth){
            if(height[left]<height[rigth]){
                left++;
                maxleft=Math.max(maxleft,height[left]);
                result+=maxleft-height[left];
            }
            else{
                rigth--;
                maxrigth=Math.max(maxrigth,height[rigth]);
                result+=maxrigth-height[rigth];
            }
        }
        return result;
    }
}