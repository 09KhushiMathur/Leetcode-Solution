class Solution {
    public void func(int[] nums,int n,boolean[]visited,List<Integer>diary,List<List<Integer>>res){
        if(n == diary.size()){
            res.add(new ArrayList<>(diary));
            return;
        }
        for(int i = 0;i<n;i++){
            if(visited[i]==true){
                continue;
            }
            diary.add(nums[i]);
            visited[i]= true;
            func(nums,n,visited,diary,res);
            diary.remove(diary.size()-1);
            visited[i] = false;
        }
        return;
    }

    public List<List<Integer>> permute(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        List<Integer> diary = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        func(nums, n, visited, diary, res);
        return res;

    }
}