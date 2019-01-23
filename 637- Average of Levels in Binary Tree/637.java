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
    class LevelNode{
        public TreeNode root;
        public int level;
        public LevelNode(TreeNode r, int l){
            root = r;
            level = l;
        }
    }
    public List<Double> averageOfLevels(TreeNode root) {
        LevelNode nroot = new LevelNode(root, 0);
        ArrayList <LevelNode> queue = new ArrayList<LevelNode>();
        ArrayList <Double> result = new ArrayList<Double>();
        if(root == null)
            return result;
        queue.add(nroot);
        int currLevel = 0, num = 0;
        double avg = 0;
        while(queue.isEmpty() != true){
            nroot = queue.remove(0);
            if(currLevel != nroot.level){
                result.add((double) avg/num);
                avg = 0;
                num = 0;
                currLevel = nroot.level;
            }
            avg += nroot.root.val;
            num += 1;
            if(nroot.root.left != null)
                queue.add(new LevelNode(nroot.root.left, nroot.level + 1));
            if(nroot.root.right != null)
                queue.add(new LevelNode(nroot.root.right, nroot.level + 1));
        }
        result.add((double) avg/num);
        return result;
    }
}