import java.util.Arrays;

class Solution {
    public int majorityElement(int[] nums) {
        // Step 1: Sort the array
        Arrays.sort(nums);
        
        // Step 2: The majority element will always be at the middle index
        return nums[nums.length / 2];
    }
}
