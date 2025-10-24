class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        // Start by assuming the whole first word is the common prefix
        String prefix = strs[0];

        // Compare the prefix with each word in the array
        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the beginning of strs[i]
           // This line checks whether the current string (strs[i]) starts with   the current prefix.
            while (strs[i].indexOf(prefix) != 0) {   // alternate : while (!strs[i].startsWith(prefix)) {
                // Chop off the last character of the prefix
                prefix = prefix.substring(0, prefix.length() - 1);

                // If prefix becomes empty, no common prefix exists
                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }
}
