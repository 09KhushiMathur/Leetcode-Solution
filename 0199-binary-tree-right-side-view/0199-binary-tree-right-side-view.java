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
    List<Integer> ans = new ArrayList<>();

    public List fumc(TreeNode root) {
            if(root == null){
                return ans;
            }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int qsize = q.size();
            for (int i = 0; i < qsize; i++) {
                TreeNode cn = q.poll();
                if (i == qsize - 1) {
                    ans.add(cn.val);
                }
                if (cn.left != null) {
                    q.offer(cn.left);
                }
                if (cn.right != null) {
                    q.offer(cn.right);
                }
            }
        }
        return ans;
    }

    public List<Integer> rightSideView(TreeNode root) {
        fumc(root);
        return ans;

    }
}