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
    public TreeNode increasingBST(TreeNode root) {
        if(root == null)
            return null;
        ArrayList inOrder = new ArrayList<TreeNode>();
        makeSkewBST(root, inOrder);
        TreeNode nroot = (TreeNode) inOrder.get(0);
        for(int i = 0; i < inOrder.size() - 1; i++){
            nroot = (TreeNode) inOrder.get(i);
            nroot.left = null;
            nroot.right = (TreeNode)inOrder.get(i + 1);
            nroot = nroot.right;
        }
        nroot.left = nroot.right = null;
        return (TreeNode) inOrder.get(0);
    }
    void makeSkewBST(TreeNode root, ArrayList<TreeNode> inOrder){
        if(root == null)
            return;
        makeSkewBST(root.left, inOrder);
        inOrder.add(root);
        makeSkewBST(root.right, inOrder);
    }
}