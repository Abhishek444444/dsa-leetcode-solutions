class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // value → index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i]; // number needed to reach target

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i }; // found a match
            }

            map.put(nums[i], i); // store current number and its index
        }

        return new int[] {}; // not found
    }
}
