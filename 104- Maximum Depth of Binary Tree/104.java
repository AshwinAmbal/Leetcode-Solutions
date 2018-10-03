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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int dl = 1 + maxDepth(root.left);
        int dr = 1 + maxDepth(root.right);
        return dl<dr ? dr : dl;
    }
}