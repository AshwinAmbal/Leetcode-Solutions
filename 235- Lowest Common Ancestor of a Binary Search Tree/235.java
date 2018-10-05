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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return root; 
        TreeNode result_l = lowestCommonAncestor(root.left, p, q); 
        TreeNode result_r = lowestCommonAncestor(root.right, p, q) ;
        if(root.val == p.val || root.val == q.val || result_r != null && result_l != null)
            return root;
        else if(result_l != null)
            return result_l;
        else if(result_r != null)
            return result_r;
        return null;
    }
}