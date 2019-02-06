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
    int max = Integer.MIN_VALUE;
    public int longestUnivaluePath(TreeNode root) {
        if(root == null)
            return 0;
        int leftCount = 0, rightCount = 0;
        if(root.left != null && root.left.val == root.val){
            leftCount += 1 + longestUnivaluePathHelper(root.left);
        }
        if(root.right != null && root.right.val == root.val){
            rightCount += 1 + longestUnivaluePathHelper(root.right);
        }
        if(leftCount != 0 && rightCount != 0)
            max = Math.max(max, leftCount + rightCount);
        leftCount = Math.max(leftCount, rightCount);
        max = Math.max(leftCount, max);
        max = Math.max(max, longestUnivaluePath(root.left));
        max = Math.max(max, longestUnivaluePath(root.right));
        return max;
    }
    
    int longestUnivaluePathHelper(TreeNode root) {
        if(root == null)
            return 0;
        int leftCount = 0, rightCount = 0;
        if(root.left != null && root.left.val == root.val){
            leftCount += 1 + longestUnivaluePathHelper(root.left);
        }
        if(root.right != null && root.right.val == root.val){
            rightCount += 1 + longestUnivaluePathHelper(root.right);
        }
        return Math.max(leftCount, rightCount);
    }
}