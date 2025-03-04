class Solution {
    // Function to find length of longest increasing subsequence.
    static int lis(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n][n+1];
        for(int[] d : dp) Arrays.fill(d, -1);
        return func(0, -1, arr, dp);
    }
    static int func(int ind, int prev_ind, int[] arr, int[][] dp) {
        if(ind == arr.length) return 0;
        if(dp[ind][prev_ind + 1] != -1) return dp[ind][prev_ind + 1];
        int ans = func(ind+1, prev_ind, arr, dp);
        if(prev_ind == -1 || arr[ind] > arr[prev_ind]) {
            ans = Math.max(ans, 1 + func(ind + 1, ind, arr, dp));
        }
        return dp[ind][prev_ind+1] = ans;
    }
}
