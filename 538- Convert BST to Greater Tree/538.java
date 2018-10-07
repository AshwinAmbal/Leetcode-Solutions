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
    int inorderSum(TreeNode root){
        if(root == null) return 0;
        return inorderSum(root.left) + inorderSum(root.right) + root.val;
    }
    
    TreeNode convertBSTHelper(TreeNode root, int sum){
        if(root == null) return null;
        int new_sum = sum + inorderSum(root.right);
        TreeNode new_root = new TreeNode(new_sum + root.val);
        new_root.left = convertBSTHelper(root.left, new_sum + root.val);
        new_root.right = convertBSTHelper(root.right, sum);
        return new_root;
    }
    
    public TreeNode convertBST(TreeNode root) {
        return convertBSTHelper(root, 0);
    }
}