class Solution {
    public void func(int[] nums, int n, int idx, boolean[] visited, List<Integer> diary, List<List<Integer>> res) {
        if (diary.size() == nums.length) {
            res.add(new ArrayList<>(diary));
            return;
        }
        for (int i = 0; i < n; i++) {
            if (visited[i] == true) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i-1]) {
                continue;
            }
            diary.add(nums[i]);
            visited[i] = true;
            func(nums, n, idx + 1, visited, diary, res);
            diary.remove(diary.size() - 1);
            visited[i] = false;
        }
        return;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int idx = 0;
        List<Integer> diary = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        boolean[] visited = new boolean[n];
        func(nums, n, idx, visited, diary, res);
        return res;

    }
}