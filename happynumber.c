#include <stdio.h>
#include <stdbool.h>

// Helper function to calculate the sum of squares of digits
int getNext(int n) {
    int total = 0;
    while (n > 0) {
        int digit = n % 10;
        total += digit * digit;
        n /= 10;
    }
    return total;
}

// Main logic using the hardcoded loop-detection shortcut
bool isHappy(int n) {
    // 4 is the universal anchor for all unhappy numbers
    while (n != 1 && n != 4) {
        n = getNext(n);
    }
    return n == 1;
}
