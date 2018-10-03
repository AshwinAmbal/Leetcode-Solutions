/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class NodewithLevel{
    public TreeNode t;
    public int level;
    NodewithLevel() {
        t = new TreeNode(Integer.MIN_VALUE);
        level = 0;
    }
    NodewithLevel(TreeNode tr, int l) {
        t = tr;
        level = l;
    }
}

class Solution {    
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> container = new ArrayList<List<Integer>>();
        if(root == null) return container;
        List<Integer> con = new ArrayList<Integer>();
        con.add(root.val);
        container.add(con);
        con = new ArrayList<Integer>();
        LinkedList <NodewithLevel>queue = new LinkedList<NodewithLevel>();
        queue.add(new NodewithLevel(root, 0));
        NodewithLevel tn;
        TreeNode t;
        int levelp = 0, levelc = 0;
        while(!queue.isEmpty()){
            tn = queue.remove();
            t = tn.t;
            levelp = tn.level;
            if(levelc != levelp)
                con = new ArrayList<Integer>();
            if(t.left!=null){
                queue.add(new NodewithLevel(t.left, tn.level + 1));
            }
            if(t.right!=null){
                queue.add(new NodewithLevel(t.right, tn.level + 1));
            }
            if(levelp != 0)
                con.add(t.val);
            if(!con.isEmpty() && levelc != levelp){
                //System.out.println(con);
                container.add(con);    
            }
            levelc = levelp;
        }
        Collections.reverse(container);
        return container;
    }
}