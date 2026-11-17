class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Handle edge case where array is empty
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Assume the first string is the common prefix
        String prefix = strs[0];
        
        // Compare the prefix with all remaining strings in the array
        for (int i = 1; i < strs.length; i++) {
            // Keep shortening the prefix until it fits the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
