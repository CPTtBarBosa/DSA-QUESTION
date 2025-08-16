class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    
        int row=matrix.length;
        int col=matrix[0].length;
        int left=0;
        int rig=(row*col)-1;
        
        while(left<= rig){
            int mid=left+(rig-left)/2;
            int rows=mid/col;
            int cols=mid%col;
            if(matrix[rows][cols]== target){
                return true;
            }
            else if(matrix[rows][cols]<target){
                left=mid+1;
            }
            else{
                rig=mid-1;
            }
        }
        return false;
   

    }
}