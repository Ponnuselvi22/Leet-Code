class Solution {
    public boolean isPalindrome(int x) {
        // Base cases: 
        // 1. Negative numbers are not palindromes.
        // 2. Numbers ending in 0 are not palindromes (except 0 itself).
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;
        // Keep popping digits from the back of x and adding them to reversedHalf
        while (x > reversedHalf) {
            int pop = x % 10;
            reversedHalf = (reversedHalf * 10) + pop;
            x /= 10;
        }

        // For even-length numbers (e.g., 1221), x will equal reversedHalf (12 == 12).
        // For odd-length numbers (e.g., 12321), x will be 12 and reversedHalf will be 123.
        // We can get rid of the middle digit by doing reversedHalf / 10.
        return x == reversedHalf || x == reversedHalf / 10;
    }
}
