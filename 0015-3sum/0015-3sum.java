class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // Step 1: Sort the array to use two-pointer technique
        Arrays.sort(nums);

        // Step 2: Create a list to store unique triplets
        List<List<Integer>> triplets = new ArrayList<>();

        // Step 3: Loop through the array, fixing one element at a time
        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate elements to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int target = -nums[i]; // We want nums[j] + nums[k] = -nums[i]
            int j = i + 1; // Start pointer from the next element
            int k = nums.length - 1; // End pointer at the end of the array

            // Step 4: Apply two-pointer approach
            while (j < k) {
                int sum = nums[j] + nums[k];

                if (sum == target) {
                    // Found a valid triplet
                    triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicates for j and k
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;

                    // Move both pointers
                    j++;
                    k--;
                } else if (sum < target) {
                    // We need a larger sum, move j to the right
                    j++;
                } else {
                    // We need a smaller sum, move k to the left
                    k--;
                }
            }
        }

        // Return the list of unique triplets
        return triplets;
    }
}
