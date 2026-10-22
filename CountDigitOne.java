class Solution {
    public int countDigitOne(int n) {
        if (n <= 0) return 0;

        long count = 0;
        
        // Use long for 'i' and 'divider' to avoid integer overflow 
        // when multiplying near the 10^9 boundary.
        for (long i = 1; i <= n; i *= 10) {
            long divider = i * 10;
            
            // 1. Count '1's from fully completed cycles
            count += (n / divider) * i;
            
            // 2. Count '1's from the remaining partial cycle
            count += Math.max(0L, Math.min(i, (n % divider) - i + 1));
        }
        
        return (int) count;
    }
}
