import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solve(int m, int n, int maxMove, int r, int c, Map<String, Integer> memo) {
        int mod = 1000000007;
        
        // Check if the move is outside the grid
        if (r < 0 || c < 0 || r == m || c == n) {
            return 1;
        }
        
        // Check if there are no more moves left
        if (maxMove == 0) {
            return 0;
        }
        
        // Check if the result is already computed
        String key = r + "_" + c + "_" + maxMove;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        
        // Calculate the number of ways to move in all directions
        int x = (solve(m, n, maxMove - 1, r - 1, c, memo) + solve(m, n, maxMove - 1, r + 1, c, memo)) % mod;
        int y = (solve(m, n, maxMove - 1, r, c - 1, memo) + solve(m, n, maxMove - 1, r, c + 1, memo)) % mod;
        
        // Save the result in the memo table
        memo.put(key, (x + y) % mod);
        
        return memo.get(key);
    }
    
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        Map<String, Integer> memo = new HashMap<>();
        return solve(m, n, maxMove, startRow, startColumn, memo);
    }
}
