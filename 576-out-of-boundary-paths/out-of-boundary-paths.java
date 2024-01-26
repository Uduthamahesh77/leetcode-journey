class Solution {
    Integer dp[][][];
    public int solve(int m,int n,int maxmove,int r,int c){
       
        int mod=(int)1e9+7;
        if(r<0 || c<0||r==m||c==n){
            return 1;
        }
        if(dp[r][c][maxmove]!=null){
            return dp[r][c][maxmove];
        }
        if(maxmove==0){
            return 0;
        }
        int x=(solve(m,n,maxmove-1,r-1,c)+solve(m,n,maxmove-1,r+1,c))%mod;
        int y=(solve(m,n,maxmove-1,r,c-1)+solve(m,n,maxmove-1,r,c+1))%mod;
        return dp[r][c][maxmove]=(x+y)%mod;
    }
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        dp=new Integer[m][n][maxMove+1];
        return solve(m,n,maxMove,startRow,startColumn);
    }
}