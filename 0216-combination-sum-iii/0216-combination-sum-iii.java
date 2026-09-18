class Solution {
    public void combination(int[] arr, int count, int idx, List<List<Integer>> res, List<Integer> diary,
            int k, int n,
            int sum) {
        if (count == k && sum == n) {
            res.add(new ArrayList<>(diary));
            return;
        }
        if (count == k || sum > n || idx == arr.length) {
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            diary.add(arr[i]);
            combination(arr, count + 1, i + 1, res, diary, k, n, sum + arr[i]);
            diary.remove(diary.size() - 1);

        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();
        combination(arr, 0, 0, res, diary, k, n, 0);
        return res;

    }
}