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
    public boolean isUnivalTree(TreeNode root) {
        HashSet <Integer> set = new HashSet<Integer>();
        isUnivalTreeHelper(root, set);
        if(set.size() == 1)
            return true;
        else
            return false;
    }
    
    public void isUnivalTreeHelper(TreeNode root, HashSet<Integer> set){
        if(root == null)
            return;
        set.add(root.val);
        if(root.left != null)
            isUnivalTreeHelper(root.left, set);
        if(root.right != null)
            isUnivalTreeHelper(root.right, set);
    }
}