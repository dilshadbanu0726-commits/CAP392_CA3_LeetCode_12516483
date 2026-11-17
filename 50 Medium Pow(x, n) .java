class Solution {
    public double myPow(double x, int n) {
        // Handle negative powers by using a positive long to prevent overflow
        long binForm = n;
        if (binForm < 0) {
            x = 1 / x;
            binForm = -binForm;
        }
        
        double ans = 1.0;
        double currentProduct = x;
        
        while (binForm > 0) {
            // If binForm is odd, multiply currentProduct to ans
            if (binForm % 2 == 1) {
                ans *= currentProduct;
            }
            
            // Square the base and halve the exponent
            currentProduct *= currentProduct;
            binForm /= 2;
        }
        
        return ans;
    }
}
