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
    public int findSecondMinimumValue(TreeNode root) {
        if(root == null)
            return -1;
        if(root.left == null)
            return -1;
        int smallest = root.val;
        if(root.left.val == root.right.val){
            int temp_l = findSecondMinimumValue(root.left);
            int temp_r = findSecondMinimumValue(root.right);
            if(temp_l == -1 && temp_r == -1)
                return -1;
            else if(temp_l == -1 || temp_r == -1)
                return temp_l == -1 ? temp_r : temp_l;
            else
                return temp_l < temp_r ? temp_l : temp_r;
        }
        else{
            int secSmallest = root.left.val == root.val ? root.right.val : root.left.val;
            root = root.left.val == root.val ? root.left : root.right;
            int subSmall = findSecondMinimumValue(root);
            if(subSmall != -1 && subSmall < secSmallest)
                secSmallest = subSmall;
            return secSmallest == smallest ? -1 : secSmallest;
        }
    }
}