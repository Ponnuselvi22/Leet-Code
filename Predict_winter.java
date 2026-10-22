class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        
        // If the array size is even, Player 1 can always force a win
        if (n % 2 == 0) {
            return true;
        }
        
        // 1D DP array to optimize space to O(n)
        int[] dp = new int[n];
        
        // Base case: Subarrays of length 1
        for (int i = 0; i < n; i++) {
            dp[i] = nums[i];
        }
        
        // Build the DP values for larger subarrays
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i] = Math.max(nums[i] - dp[i + 1], nums[j] - dp[i]);
            }
        }
        
        return dp[0] >= 0;
    }
}
