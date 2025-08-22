class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int rows=matrix.length;
        int col=matrix[0].length;
        int top=0;
        int bottom=rows-1;
        int left=0;
        int rigth=col-1;
        while(left<=rigth && top<=bottom){
            for(int i=left;i<=rigth;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int j=top;j<=bottom;j++){
                result.add(matrix[j][rigth]);
            }
            rigth--;
            if(top<=bottom){
            for(int k=rigth;k>=left;k--){
                result.add(matrix[bottom][k]);
            }
            
            bottom--;
            }
            if(left<=rigth){
            for(int l=bottom;l>=top;l--){
                result.add(matrix[l][left]);
            }
            left++;
            }
        } 
        return result;
        
    }
}