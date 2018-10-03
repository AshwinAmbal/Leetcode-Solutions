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
    int height(TreeNode root){
        if(root == null) 
            return 0;
        int lh = height(root.left), rh = height(root.right);
        if(lh == -1) return -1;
        if(rh == -1) return -1;
        if(Math.abs(lh-rh) > 1) 
            return -1;
        return 1 + Math.max(lh, rh);
        
    }
    
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return height(root) != -1;
    }
}