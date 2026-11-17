class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        
        // Loop through each digit of n
        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            product *= digit;   // Multiply it to the product
            sum += digit;       // Add it to the sum
            n /= 10;            // Remove the last digit
        }
        
        // Return the difference
        return product - sum;
    }
}
