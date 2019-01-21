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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1 != null && root2 == null || root1 == null && root2 != null)
            return false;
        if(root1 == null && root2 == null)
            return true;
        ArrayList<Integer> first = new ArrayList<Integer>();
        findLeafOrder(root1, first);
        ArrayList<Integer> second = new ArrayList<Integer>();
        findLeafOrder(root2, second);
        if(first.size() != second.size())
            return false;
        else{
            for(int i = 0; i < first.size(); i++){
                if(first.get(i) != second.get(i))
                    return false;
            }
        }
        return true;
    }
    void findLeafOrder(TreeNode root, ArrayList<Integer> order){
        if(root == null)
            return;
        if(root.left == null && root.right == null)
            order.add(root.val);
        else{
            findLeafOrder(root.left, order);
            findLeafOrder(root.right, order);
        }
    }
}