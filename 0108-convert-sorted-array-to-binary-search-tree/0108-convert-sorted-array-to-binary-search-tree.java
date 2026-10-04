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
    public TreeNode build(int [] nums,int low,int high){
        if(low>high){
            return null;
        }
        int id = low+(high-low)/2;
        TreeNode root = new TreeNode(nums[id]);

        root.left = build(nums,low,id-1);
        root.right = build(nums,id+1,high);

        return root;

    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums,0,nums.length-1);
        
    }
}