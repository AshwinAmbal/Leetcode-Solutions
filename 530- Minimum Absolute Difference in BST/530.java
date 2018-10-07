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
    static int min = -1, max=-1; 
    public int getMinimumDifference(TreeNode root) {
        int diff=Integer.MAX_VALUE;
        int n = -1;
        return getMinimumDiff(root, diff, n);
    }
    public int getMinimumDiff(TreeNode root, int diff, int temp) {
        if(root == null) return Integer.MAX_VALUE;
        temp = getMinimumDiff(root.left, diff, temp);
        if(diff > temp)
            diff = temp;
        max = root.val;
        if(min!=-1)
            if(diff>Math.abs(max-min))
                diff = Math.abs(max-min);
        min = root.val;
        temp = getMinimumDiff(root.right, diff, temp);
        if(diff > temp)
            diff = temp;
        return diff;   
    }
}