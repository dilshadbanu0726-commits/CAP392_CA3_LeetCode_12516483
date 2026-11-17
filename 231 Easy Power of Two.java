class Solution {
    public boolean isPowerOfTwo(int n) {
        // Numbers less than or equal to 0 cannot be powers of two
        if (n <= 0) {
            return false;
        }
        
        // Keep dividing by 2 while it's even
        while (n % 2 == 0) {
            n /= 2;
        }
        
        // If we reached 1, it was a power of two
        return n == 1;
    }
}
