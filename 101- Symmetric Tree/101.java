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
    boolean isSymmetricHelper(TreeNode left, TreeNode right){
        boolean flag = true;
        if(left == null && right == null) return true;
        if(left == null && right!= null || left != null && right== null ) return false;
        if(left.val != right.val) return false;
        if(isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left))
            return true;
        return false;
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) 
            return true;
        else
            return isSymmetricHelper(root.left, root.right);
    } 
}