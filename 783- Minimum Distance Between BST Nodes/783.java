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
    public int minDiffInBST(TreeNode root) {
        ArrayList <Integer> nodes = new ArrayList<Integer>();
        inOrderTraversal(root, nodes);
        int minDiff = Integer.MAX_VALUE;
        for(int i =0; i < nodes.size() - 1; i++){
            minDiff = Math.min(minDiff, nodes.get(i + 1) - nodes.get(i));
        }
        return minDiff;
    }
    
    void inOrderTraversal(TreeNode root, ArrayList<Integer> nodes){
        if(root == null)
            return;
        inOrderTraversal(root.left, nodes);
        nodes.add(root.val);
        inOrderTraversal(root.right,nodes);
    }
}