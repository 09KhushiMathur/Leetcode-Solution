class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        while(low<high){
            int m = (low+high)/2;
            if(nums[m]>nums[high]){
                low = m+1;
            }else{
                high = m;
            }
        }
        return nums[low];
        
    }
}