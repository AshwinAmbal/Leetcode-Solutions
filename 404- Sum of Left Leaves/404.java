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
    private int sumOfLeftLeavesHelper(TreeNode root, int flag){
        if(root == null)
            return 0;
        int sum = 0;
        sum += sumOfLeftLeavesHelper(root.left, 0);
        sum += sumOfLeftLeavesHelper(root.right, 1);
        if(root.left == null && root.right == null && flag == 0)
            return root.val + sum;
        return sum;   
    }
    
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null || (root.left == null && root.right == null))
            return 0;
        else
            return sumOfLeftLeavesHelper(root, 0);
    }
}