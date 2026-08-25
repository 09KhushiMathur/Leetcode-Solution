class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l =0;
        int product = 1;
        int count = 0;
        for(int h = 0;h<nums.length;h++){
            product = product*nums[h];
            while(product>=k && l<=h){
                product = product/nums[l];
                l++;

            }
            count = count +(h-l+1);
        }
        return count;
        
    }
}