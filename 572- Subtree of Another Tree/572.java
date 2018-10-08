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
    private boolean isSub(TreeNode s, TreeNode t){
        if(s == null && t == null) 
            return true;
        if(s == null && t != null || s != null && t == null)
            return false;
        if(s.val == t.val)
            return isSub(s.left, t.left) && isSub(s.right, t.right);
        return false;        
    }
    
    public boolean isSubtree(TreeNode s, TreeNode t) {
        boolean sub_left = false, sub_right = false;
        if(isSub(s,t))
            return true;
        if(s.left != null)
            sub_left = isSubtree(s.left,t); 
        if(s.right != null)
            sub_right = isSubtree(s.right,t);
        return sub_left || sub_right;
    }
} 