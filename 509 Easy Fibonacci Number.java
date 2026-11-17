class Solution {
    public int fib(int n) {
        // Base cases: F(0) = 0, F(1) = 1
        if (n <= 1) {
            return n;
        }
        
        int prev2 = 0; // F(0)
        int prev1 = 1; // F(1)
        
        // Calculate from 2 up to n
        for (int i = 2; i <= n; i++) {
            int current = prev1 + prev2;
            prev2 = prev1;   // Shift prev1 to prev2
            prev1 = current; // Shift current to prev1
        }
        
        return prev1;
    }
}
