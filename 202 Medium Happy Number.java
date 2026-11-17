import java.util.HashSet;

class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        
        // Loop until n becomes 1 (happy) or we find a cycle
        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = getNextNumber(n);
        }
        
        return n == 1;
    }
    
    // Helper function to calculate the sum of the squares of digits
    private int getNextNumber(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
