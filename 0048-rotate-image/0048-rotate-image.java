class Solution {
    public void rotate(int[][] matrix) {
        int rows=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=i;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for(int i=0;i<rows;i++){
            int left=0;
            int rig=matrix[0].length-1;
            while(left<rig){
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][rig];
                matrix[i][rig]=temp;
                left++;
                rig--;
            }
        }
            for(int j=0;j<matrix.length;j++){
                for(int k=0;k<matrix[0].length;k++){
                    System.out.print(matrix[j][k]+"");
                }
            }
        }
        
        
       
        
    }
