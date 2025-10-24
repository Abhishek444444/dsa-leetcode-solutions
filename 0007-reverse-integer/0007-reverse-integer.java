class Solution {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder();
        boolean isNegative = x < 0;
        
        // Take absolute value and convert to string
        String numStr = Integer.toString(Math.abs(x));
        sb.append(numStr);
        sb.reverse(); // Reverse the digits

        try {
            int reversed = Integer.parseInt(sb.toString());
            return isNegative ? -reversed : reversed;
        } catch (NumberFormatException e) {
            // Happens if reversed number exceeds 32-bit int range
            return 0;
        }
    }
}
