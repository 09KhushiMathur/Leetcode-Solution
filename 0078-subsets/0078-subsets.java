class Solution {
    public void func(int []nums,int n,int idx,List<Integer>diary,List<List<Integer>>res){
        if(n == idx){
            res.add(new ArrayList<>(diary));
            return;
        }
        func(nums,n,idx+1,diary,res);
        diary.add(nums[idx]);
        func(nums,n,idx+1,diary,res);
        diary.remove(diary.size()-1);
        return;
    }

    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length;
        int idx = 0;
        List<Integer> diary = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        func(nums, n, idx, diary, res);
        return res;

    }
}