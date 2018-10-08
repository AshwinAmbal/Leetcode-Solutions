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
        //[total tilt, subtree sum]
    private int[] recurse(TreeNode root) {
        if (root == null)
            return new int[]{0,0};
        int[] left = recurse(root.left), right = recurse(root.right);
        int tilt = Math.abs(left[1] - right[1]);
        return new int[]{left[0]+right[0]+tilt, left[1]+right[1]+root.val};
    }
    public int findTilt(TreeNode root) {
        return recurse(root)[0];
    }
}
