class Solution {
    public int helper(int[] nums, int n, int threshold, int guess) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int v = (nums[i] + guess - 1) / guess;
            sum += v;
        }
        return sum;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = 0;
        int res = -1;
        for (int i = 0; i < nums.length; i++) {
            high = Math.max(high, nums[i]);
        }
        while (low <= high) {
            int guess = (low + high) / 2;
            int t = helper(nums, n, threshold, guess);
            if (t <= threshold) {
                res = guess;
                high = guess - 1;
            } else {
                low = guess + 1;
            }
        }
        return res;

    }
}