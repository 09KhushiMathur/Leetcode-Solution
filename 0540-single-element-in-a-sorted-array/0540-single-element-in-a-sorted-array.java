class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int m = (low + high) / 2;
            if (m % 2 == 0) {
                if (nums[m] == nums[m + 1]) {
                    low = m + 2;
                } else {
                    high = m;
                }
            } else {
                if (nums[m] == nums[m - 1]) {
                    low = m + 1;
                } else {
                    high = m;
                }
            }
        }
        return nums[low];

    }
}