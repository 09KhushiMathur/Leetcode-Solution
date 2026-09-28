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
    int res = 0;
    public int func(TreeNode root, int sum){
        if (root == null) {
            return 0;
        }
        int left = func(root.left,sum);
        int right = func(root.right,sum);
        sum = left + right;
        res = Math.max(res,sum);
        return 1+ Math.max(left,right);

    }

    public int diameterOfBinaryTree(TreeNode root) {
        func(root,0);
        return res;
        

    }
}