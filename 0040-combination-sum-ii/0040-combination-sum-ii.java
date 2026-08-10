class Solution {
    public void func(int[] candidates, int target, int n, int idx, int sum, List<Integer> diary,
            List<List<Integer>> res) {
            if (sum == target) {
                res.add(new ArrayList<>(diary));
                return;
            }
        for (int i = idx; i < n; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] + sum <= target) {
                diary.add(candidates[i]);
                sum = sum + candidates[i];
                func(candidates, target, n, i + 1, sum, diary, res);
                diary.remove(diary.size() - 1);
                sum = sum - candidates[i];
            }
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        int idx = 0;
        int sum = 0;
        int n = candidates.length;
        List<Integer> diary = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        func(candidates, target, n, idx, sum, diary, res);
        return res;

    }
}