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
    public String tree2str(TreeNode t) {
        if(t == null) 
            return new String("");
        if(t.left == null && t.right == null)
            return new Integer(t.val).toString();
        StringBuilder s = new StringBuilder();
        s.append(t.val);
        String s_left = tree2str(t.left);
        String s_right = tree2str(t.right);
        if(!s_left.equals(""))
            s.append("("+ s_left + ")");
        else if(s_left.equals("") && ! s_right.equals(""))
            s.append("()");
        if(!s_right.equals(""))
            s.append("("+ s_right + ")");
        return s.toString();
    }
}