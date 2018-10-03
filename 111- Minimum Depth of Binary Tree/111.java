/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class TreeNodeLevel{
    TreeNode t;
    int level;
    TreeNodeLevel(){
        TreeNode t = new TreeNode(Integer.MIN_VALUE);
        level = -1;
    }
    TreeNodeLevel(TreeNode tr, int l){
        t = tr;
        level = l;
    }
}

class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        LinkedList <TreeNodeLevel> queue = new LinkedList<TreeNodeLevel>();
        TreeNodeLevel tr = new TreeNodeLevel(root, 1);
        TreeNode temp;
        int level = -1;
        queue.add(tr);
        while(!queue.isEmpty()){
            tr = queue.remove();
            temp = tr.t;
            level = tr.level;
            if(temp.left == null && temp.right==null)
                return level;
            if(temp.left!=null)
                queue.add(new TreeNodeLevel(temp.left, level + 1));
            if(temp.right!=null)
                queue.add(new TreeNodeLevel(temp.right, level + 1));
        }
        return level;
    }
}