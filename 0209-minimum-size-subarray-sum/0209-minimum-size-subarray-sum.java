class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int low = 0;
        int res = Integer.MAX_VALUE;
        for (int high = 0; high < nums.length; high++) {
            sum = sum + nums[high];
            while (sum >= target) {
                int len = high - low + 1;
                res = Math.min(res, len);
                sum = sum - nums[low];
                low++;

            }

        }
        if (res == Integer.MAX_VALUE) {
            return 0;
        }
        return res;

    }
}