class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        while (low<= high) {
            int m = (low + high) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[m] > nums[n-1]) {
                if (nums[m] < target) {
                    low = m + 1;
                } else {
                    if (nums[low] > target) {
                        low = m + 1;
                    } else {
                        high = m - 1;
                    }
                }
            } else {
                if (nums[m] > target) {
                    high = m - 1;
                } else {
                    if (nums[n - 1] < target) {
                        high = m - 1;
                    } else {
                        low = m + 1;
                    }
                }
            }
        }
        return -1;

    }
}