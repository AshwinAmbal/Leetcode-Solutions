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
    void binaryTreePaths(TreeNode root, String s, List <String> l){    
        if(root.left == null && root.right == null){
            l.add(s + Integer.toString(root.val));
        }
        if(root.left != null)
            binaryTreePaths(root.left, s + Integer.toString(root.val) + "->", l); 
        if(root.right != null)
            binaryTreePaths(root.right, s + Integer.toString(root.val) + "->", l);
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null) return new ArrayList<String>();
        String s = new String();
        List <String> l = new ArrayList<String>();
        binaryTreePaths(root, s, l);
        return l;
    }
}