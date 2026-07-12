class Solution {
    public boolean helper(int[] nums, int n, int k, int guess) {
        int part = 1;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (sum + nums[i] <= guess) {
                sum += nums[i];
            } else {
                part++;
                sum = nums[i];
            }
        }
        if (part > k) {
            return false;
        }
        return true;
    }

    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int high = 0;
        for (int i = 0; i < n; i++) {
            low = Math.max(low, nums[i]);
            high = high + nums[i];
        }
        int res = -1;
        while(low<=high){
            int guess = low + (high-low)/2;
            if(helper(nums,n,k,guess)== true){
                res = guess;
                high = guess-1;
            }
            else{
                low = guess+1;
            }
        }
        return res;

    }
}