class Solution {
    static int solve(int W,int[] val,int[] wt,int i,int[][] dp){
        if(i==wt.length) return 0;
        if(dp[i][W] != -1)return dp[i][W];
        int include = 0;
        if(wt[i]<=W) include = val[i]+solve(W-wt[i],val,wt,i+1,dp);
        int exclude = solve(W,val,wt,i+1,dp);
        return dp[i][W] = Math.max(include,exclude);
    }
    
    static int knapsack(int W, int val[], int wt[]) {
        int[][] dp = new int[val.length][W+1];
        for(int i=0;i<val.length;i++)
            for(int j=0;j<W+1;j++)
                dp[i][j]=-1;
        return solve(W,val,wt,0,dp);
        
    }
}
