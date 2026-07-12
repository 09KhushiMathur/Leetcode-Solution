class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;

        int low = 1;
        int high = x / 2;
        int ans = 1;

        while (low <= high) {
            int guess = low + (high - low) / 2;

            if (guess <= x / guess) {
                ans = guess;
                low = guess + 1;
            } else {
                high = guess - 1;
            }
        }

        return ans;
    }
}