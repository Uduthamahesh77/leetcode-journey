class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
       int t[][]=new int[n][matrix[0].length];
       for(int col=0;col<matrix[0].length;col++){
           t[0][col]=matrix[0][col];
       }
       
       for(int row=1;row<n;row++){
           for(int col=0;col<matrix[0].length;col++){
               int a=Integer.MAX_VALUE;
       int b=Integer.MAX_VALUE;
       if(col-1>=0){
           a=t[row-1][col-1];
       }
       if(col+1<matrix[0].length){
           b=t[row-1][col+1];
       }
               t[row][col]=matrix[row][col]+ Math.min(t[row-1][col],Math.min(b,a));
           }
       }
       int result=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
           result=Math.min(t[n-1][i],result);
       }
       return result;
    }
}