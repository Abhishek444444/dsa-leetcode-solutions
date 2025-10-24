class Solution {
    public int romanToInt(String s) {

        // Step 1: Create a map to store Roman numeral values
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;  // Variable to store the final result

        // Step 2: Loop through each character in the string
        for (int i = 0; i < s.length(); i++) {
            int curr = map.get(s.charAt(i));  // Current symbol's value
            int next = 0;

            // If not at the last character, get the next symbol's value
            if (i + 1 < s.length()) {
                next = map.get(s.charAt(i + 1));
            }

            // Step 3: Apply subtraction rule
            if (curr < next) {
                // If current value is less than next → subtract it
                total -= curr;
            } else {
                // Else, just add the current value
                total += curr;
            }
        }

        // Step 4: Return the total converted value
        return total;
    }
}
