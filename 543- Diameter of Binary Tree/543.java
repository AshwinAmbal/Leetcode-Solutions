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
    int max;
	int height(TreeNode root){
        if(root == null) return 0;
        int hl = height(root.left);
        int hr = height(root.right);
		max = Math.max(max, hl + hr);
        return Math.max(hl, hr) + 1;
    }
    
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
		max = 0;
        height(root); 
		return max;
    }
}