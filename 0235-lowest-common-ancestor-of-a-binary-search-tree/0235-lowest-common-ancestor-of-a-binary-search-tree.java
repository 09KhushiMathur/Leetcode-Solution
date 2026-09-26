/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    TreeNode ans = null;
    public TreeNode func(TreeNode root, TreeNode p, TreeNode q){
    if(root == null){
return null;
    }
    if(root == p || root == q){
        ans = root;
        return ans;
    }
    if(root.val<p.val){
        ans = func(root.right,p ,q);
    }
    else if(root.val>q.val){
        ans = func(root.left, p,q);
    }else{
        ans = root;
    }
        return ans;
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val<q.val){
            func(root,p,q);
        }else{
            func(root,q,p);
        }
       return ans;
    }
   
}