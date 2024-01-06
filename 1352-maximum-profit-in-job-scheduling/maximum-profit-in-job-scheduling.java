class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] table = new int[n][3];
        for (int i = 0; i < n; i++) {
            table[i][0] = startTime[i];
            table[i][1] = endTime[i];
            table[i][2] = profit[i];
        }
        Arrays.sort(table, (a, b) -> a[1] - b[1]); 
        int[] dp = new int[n];
        dp[0] = table[0][2];
        for (int i = 1; i < n; i++) {
            int curr = table[i][2];
            int prev_nonoverlap_profit_job = -1;
            for (int j = i - 1; j >= 0; j--) {
                if (table[j][1] <= table[i][0]) {
                    prev_nonoverlap_profit_job = j;
                    break;
                }
            }
            if (prev_nonoverlap_profit_job != -1) {
                curr += dp[prev_nonoverlap_profit_job];
            }
            dp[i] = Math.max(curr, dp[i - 1]);
        }
        return dp[n - 1];
    }
}