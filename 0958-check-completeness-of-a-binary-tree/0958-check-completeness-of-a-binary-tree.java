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
    boolean nullfound = false;

    public boolean func(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode t = q.poll();
            if (t == null) {
                nullfound = true;
            } else {
                if (nullfound == true) {
                    return false;
                }
                q.offer(t.left);
                q.offer(t.right);

            }
        }
        return true;
    }

    public boolean isCompleteTree(TreeNode root) {
        return func(root);

    }
}