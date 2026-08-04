class Solution {
    public void func(int []candidates,int n,int idx,int sum,ArrayList<Integer>diary,List<List<Integer>>res,int target){
        if(idx == n){
            if(sum == target){
                res.add(new ArrayList<>(diary));
            }
            return;
        }

    func(candidates,n,idx+1,sum,diary,res,target);
    if(sum + candidates[idx]<=target){
        diary.add(candidates[idx]);
        sum = sum + candidates[idx];
        func(candidates,n,idx,sum,diary,res,target);
        diary.remove(diary.size()-1);
        sum = sum - candidates[idx];
    }
    return ;
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int idx = 0;
        int sum = 0;
        ArrayList<Integer> diary = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        int n = candidates.length;
        func(candidates,n,idx,sum,diary,res,target);
        return res;

        
    }
}