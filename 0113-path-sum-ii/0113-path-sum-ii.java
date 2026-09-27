/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void func(TreeNode root, int targetSum, List<List<Integer>> res, List<Integer> diary,
            int sum) {
        if (root == null) {
            return ;
        }
        diary.add(root.val);
        sum = sum + root.val;
        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                res.add(new ArrayList<>(diary));
                diary.remove(diary.size() - 1);
                return;
            }
        }
        func(root.left, targetSum, res, diary, sum);
        func(root.right, targetSum, res, diary, sum);
        diary.remove(diary.size() - 1);
    }

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> diary = new ArrayList<>();
        func(root, targetSum, res, diary, 0);
        return res;

    }
}