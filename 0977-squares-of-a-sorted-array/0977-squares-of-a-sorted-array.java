class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int idx = n - 1;

        int l = 0;
        int r = n-1;
        int[] ans = new int[n];
        while (l <= r) {
            int lSqr = nums[l] * nums[l];
            int rSqr = nums[r] * nums[r];
            if (lSqr < rSqr) {
                ans[idx] = rSqr;
                idx--;
                r--;
            } else {
                ans[idx] = lSqr;
                idx--;
                l++;
            }
        }
        return ans;

    }
}