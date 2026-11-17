class Solution {
    public int addDigits(int num) {
        // Keep looping while the number has 2 or more digits
        while (num >= 10) {
            int sum = 0;
            
            // Extract and sum up each digit
            while (num > 0) {
                sum += num % 10; // Get the last digit
                num /= 10;       // Remove the last digit
            }
            
            num = sum; // Assign the sum back to num for the next iteration
        }
        
        return num;
    }
}
