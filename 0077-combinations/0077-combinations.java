class Solution {
    public void func(int n,int k,int current,List<Integer>diary, List<List<Integer>>res){
        if(n<current){
            if(diary.size()==k){
                res.add(new ArrayList<>(diary));
            }
            return;
        }
        func(n,k,current+1,diary,res);
        diary.add(current);
        func(n,k,current+1,diary,res);
        diary.remove(diary.size()-1);
        return;

    }

    public List<List<Integer>> combine(int n, int k) {
        int current = 1;
        List<Integer> diary = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        func(n, k, current, diary, res);
        return res;

    }
}